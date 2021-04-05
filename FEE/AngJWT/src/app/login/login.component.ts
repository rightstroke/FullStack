import { Component, OnInit } from '@angular/core';

import { Auth } from '../auth';
import {AuthService} from "../auth.service";
import { map, filter, scan, catchError } from 'rxjs/operators';
import { Authresponse } from '../authresponse';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username="kabali";
  password="kabali";
  auth:Auth;

  constructor(private AServie:AuthService,private router:Router) { }

  doLogin(){
    console.log(this.username + "," + this.password);
    this.auth = new Auth(this.username,this.password);
    this.AServie.doAuth(this.auth).
          subscribe((res: Authresponse) => {
            console.log("===========" + res.token);
            console.log("===========" + res.roles );
            sessionStorage.setItem("token",res.token);
            sessionStorage.setItem("roles",res.roles.toString());
            this.router.navigate(['secure']);
          },
          err => {
            console.error("Error in Observable==" + JSON.stringify(err));
          },
          () => console.log("Processing Complte.")
    );

    
  }

  ngOnInit(): void {
    sessionStorage.clear();
  }

}
