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
import { Observable, throwError } from 'rxjs';
import { retry, catchError, map } from 'rxjs/operators';
import { Rt } from './rt';

@Injectable()
export class JwtInterceptor implements HttpInterceptor {

  constructor(private httpc:HttpClient) {}

  intercept(
            request: HttpRequest<unknown>, 
            next: HttpHandler
            ): Observable<HttpEvent<unknown>> {
    return next.handle(request).pipe(
      //retry(5),
      catchError((error: HttpErrorResponse) => {
        console.log("==========From Interceptor====" + error.status);
        if (error.status === 401) {
          // refresh token
          this.doRefreshToken();
        } else {
          return throwError(error);
        }
      })
    );
  }

  private doRefreshToken(){
    const token = sessionStorage.getItem("token");


    const httpHeaders: HttpHeaders = new HttpHeaders({
      'authorization': `Bearer ${token}`,
      'isrefreshtoken': 'true',
      //'No-Auth': 'True',
      'Content-Type': 'application/json'
    });
    
    console.log("..#5...Heades" + JSON.stringify(httpHeaders));
    this.httpc.get<Rt>("http://localhost:8080/refreshtoken" ,{headers:httpHeaders}).pipe(
      map((res:Rt)=>{
        //this.startRefreshTokenTimer();
        return res;
      })
    ).subscribe((res:Rt)=>{
      sessionStorage.setItem("token",res.token);
    });

  }
}
