import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpErrorResponse,
  HttpHeaders,
  HttpClient
} from '@angular/common/http';
import { BehaviorSubject, Observable, throwError } from 'rxjs';
import { retry, catchError, map, switchMap, filter, take } from 'rxjs/operators';
import { Rt } from './rt';
import { AuthService } from './auth.service';

@Injectable()
export class JwtInterceptor implements HttpInterceptor {

  private isRefreshing = false;

  private refreshTokenSubject: BehaviorSubject<any> = new BehaviorSubject<any>(null);

  constructor(public authService: AuthService) {}



  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    if (this.authService.getJwtToken()) {
      request = this.addToken(request,this.authService.getJwtToken());
    }

    return next.handle(request).pipe(catchError(error => {
      console.log("==============1");
      if (error instanceof HttpErrorResponse && error.status === 401){
        return this.handle401Error(request,next);
      } else {
        return throwError(error);
      }
    }));
  }


  private handle401Error(request:HttpRequest<any>,next:HttpHandler){
    if (!this.isRefreshing) {
      this.isRefreshing = true;
      this.refreshTokenSubject.next(null);

      return this.authService.refreshToken().pipe (
        switchMap((token:any) => {
          this.isRefreshing = false;
          this.refreshTokenSubject.next(token.token);
          return next.handle(this.addToken(request,token.token));
        }));
    } else {
      return this.refreshTokenSubject.pipe(
        filter(token => token != null),
        take(1),
        switchMap(jwt => {
          return next.handle(this.addToken(request,jwt));
        }));
    }
  }


  private addToken(request:HttpRequest<any>,token:string) {
    return request.clone({
      setHeaders:{
        'Authorization': `Bearer ${token}`
      }
    });
  }



  // constructor(private httpc:HttpClient) {}

  // intercept(
  //           request: HttpRequest<unknown>, 
  //           next: HttpHandler
  //           ): Observable<HttpEvent<unknown>> {
  //   return next.handle(request).pipe(
  //     //retry(5),
  //     catchError((error: HttpErrorResponse) => {
  //       console.log("==========From Interceptor====" + error.status);
  //       if (error.status === 401) {
  //         // refresh token
  //         this.doRefreshToken();
  //       } else {
  //         return throwError(error);
  //       }
  //     })
  //   );
  // }

  // private doRefreshToken(){
  //   const token = sessionStorage.getItem("token");


  //   const httpHeaders: HttpHeaders = new HttpHeaders({
  //     'authorization': `Bearer ${token}`,
  //     'isrefreshtoken': 'true',
  //     //'No-Auth': 'True',
  //     'Content-Type': 'application/json'
  //   });

  //   console.log("..#5...Heades" + JSON.stringify(httpHeaders));
  //   this.httpc.get<Rt>("http://localhost:8080/refreshtoken" ,{headers:httpHeaders}).pipe(
  //     map((res:Rt)=>{
  //       //this.startRefreshTokenTimer();
  //       return res;
  //     })
  //   ).subscribe((res:Rt)=>{
  //     sessionStorage.setItem("token",res.token);
  //   });

  // }
}
