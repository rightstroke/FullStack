import { Injectable } from '@angular/core';
import { Headers } from '@angular/http';
import { Observable }        from 'rxjs/Observable';
import { HttpClient } from '@angular/common/http';
import { HttpErrorResponse, HttpResponse } from '@angular/common/http';
import { ErrorObservable } from 'rxjs/observable/ErrorObservable';
import { catchError, retry } from 'rxjs/operators';

import { Menu } from '../uimodel/menu';

import 'rxjs/add/operator/toPromise';
import 'rxjs/add/operator/map'
import { of } from 'rxjs';

@Injectable()
export class MenuService {
  private usersUrl = 'api';  // URL to web api
  private headers = new Headers({'Content-Type': 'application/json'});
  isLoggedIn = false;

  constructor(private http: HttpClient) { }


  fetchMenus(id: string): Observable<any> {
    const url = `${this.usersUrl}/${id}`;
    console.log("=========" + url);
    return this.http.get<any>(url).pipe(
        retry(3),
        catchError(this.handleError2));
  }


  private handleError2(error:HttpErrorResponse) {
    return of("Error");
  }

  
  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
        // The backend returned an unsuccessful response code.
        // The response body may contain clues as to what went wrong,
        console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
      }
      // return an ErrorObservable with a user-facing error message
      return new Error(
        'Something bad happened; please try again later.');
  };


}
