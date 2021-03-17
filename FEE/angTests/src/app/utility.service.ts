import { Injectable } from '@angular/core';
import { of, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UtilityService {

  public addnumbers(x:number,y:number):number {
    let result = 0;
    let message = "";

    if (x>20) {
      result = 20;
      message = "number greater than 20";
      console.log(message);
    } else {
      result = 50;
    }

    result = x+y + result;

    return result;
  }

  public users:Array<object> = [
    {
      id:"1",
      name:"Abcd",  
      role:"developer",
      tech:"java"
    },
    {
      id:"2",
      name:"XYZ",
      role:"Sr developer",
      tech:"java"
    },
    {
      id:"3",
      name:"1234",
      role:"architect",
      tech:"fullstack"
    },
    {
      id:"4",
      name:"asdf",
      role:"tester",
      tech:"selenium"
    },
  ];

  constructor() { }

  all():Observable<Array<object>>{
    return of(this.users);
  }

  all2():Observable<Array<object>>{
    return of([{}]);
  }

  findone(id:string):Observable<object> {
    const user = this.users.find((u:any) => {
      return u.id === id;
    });
    return of(user)
  }

}
