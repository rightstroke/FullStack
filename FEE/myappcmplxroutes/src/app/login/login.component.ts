import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private r:Router,public auth:AuthService) {
    
    this.auth.isLoggedin=false;
    console.log("========Login Constructor" + this.auth.isLoggedin );
   }

  ngOnInit(): void {
  }

  doSignup(){
    this.r.navigate([{ outlets: { sbar: ['lhsnav','fundtransfer'] } }], { skipLocationChange: true });
    this.auth.isLoggedin=true;
  }

}
