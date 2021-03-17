import { Component } from '@angular/core';
import { AuthService } from './auth.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angTest';
  mytitle = 'angTest-testing';

  constructor(private auth:AuthService){
    
  }

  needsLogin() {
    return !this.auth.isAuthenticated();
  }

  checkAdd(x:number,y:number) {
    return this.auth.doSomething(x,y);
  }



}
