import { Injectable } from "@angular/core";
import { HttpClient, HttpParams } from "@angular/common/http";
import { HttpHeaders } from "@angular/common/http";

import { Observable } from "rxjs";
import "rxjs/add/operator/toPromise";
import "rxjs/add/operator/map";
import { catchError, retry } from "rxjs/operators";

import { Book } from "./book";

@Injectable()
export class BooksService {
  booksUrl = "api/books"; // URL to web api
  unknownUrl = "api/tooks";
  private headers = new Headers({ "Content-Type": "application/json" });

  constructor(private http: HttpClient) {}

  getBooks(): Observable<Book[]> {
    return this.http.get<Book[]>(this.booksUrl);
  }

  getUnknownUrl(): Observable<Book[]> {
    return this.http.get<Book[]>(this.unknownUrl);
  }
}
