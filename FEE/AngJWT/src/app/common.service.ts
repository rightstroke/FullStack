import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { retry } from 'rxjs/operators';
import { Country } from './country';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  public url = "http://localhost:8080/countries";

  public testurl = "http://localhost:8080/helloadmin";

  public registerurl = "http://localhost:8080/register";

  constructor(private httpc:HttpClient) { }

  public getCountries():Observable<Country[]>{
    let token = sessionStorage.getItem("token");
    console.log("Token==" + token);
    //let headers:HttpHeaders = new  HttpHeaders().
     // set("authorization", "Bearer " + token);

      const httpHeaders: HttpHeaders = new HttpHeaders({
        'authorization': `Bearer ${token}`,
        'No-Auth': 'True',
        'Content-Type': 'application/json'
      });


    // return this.httpc.get<Country[]>(this.url,{headers:httpHeaders}).pipe(
    //   retry(5),
    // );

    return this.httpc.get<Country[]>(this.url);
  }

  public getTestData():Observable<any>{
    let token = sessionStorage.getItem("token");
    console.log("Token==" + token);
    let headers:HttpHeaders = new  HttpHeaders().
      set("authorization", "Bearer " + token);



      
    //return this.httpc.get<any>(this.testurl,{headers});
    return this.httpc.get<any>(this.testurl,{headers});
  }

  public doRegister(a,b):Observable<any>{
    let token = sessionStorage.getItem("token");
    console.log("Token==" + token);
    let headers:HttpHeaders = new  HttpHeaders().
      set("authorization", "Bearer " + token);

      
    //return this.httpc.get<any>(this.testurl,{headers});
    return this.httpc.post<any>(this.registerurl,{
      "username":a,
      "password":b,
      "role": [
        "ROLE_ADMIN","ROLE_USER","ABCD"  
      ]
    });
  }
}
