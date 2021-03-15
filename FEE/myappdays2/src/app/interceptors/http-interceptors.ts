import { Injectable } from "@angular/core";
import {
  HttpEvent,
  HttpInterceptor,
  HttpHandler,
  HttpRequest,
  HttpErrorResponse,
  HttpResponse
} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import "rxjs/add/operator/do";
import { catchError } from "rxjs/operators";
//import { environment } from "path to environment/environments/environment";

@Injectable()
export class ResponseInterceptor implements HttpInterceptor {
  intercept(
    request: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    return next.handle(request).pipe(
      catchError((error: HttpErrorResponse) => {
        let errMsg = "";
        // Client Side Error
        if (error.error instanceof ErrorEvent) {
          errMsg = `rajError: ${error.error.message}`;
        } else {
          // Server Side Error
          errMsg = `rajError Code: ${error.status},  Message: ${error.message}`;
        }
        console.log("Thappu here..." + errMsg);
        return throwError(errMsg);
      })
    );
  }
}
