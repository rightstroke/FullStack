import { Component,OnInit } from '@angular/core';

import { AuthService } from './auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //title = 'சிலாக்கி.. டும்';
  title = "विकिपीडिया == தமிழ் == پنجابی‬,";
  isLoggedIn:boolean;

  constructor(private authService: AuthService){}

  ngOnInit(): void {
    console.log("===================in Login Init");
    this.isLoggedIn=this.authService.isLoggedIn;
  }

}
