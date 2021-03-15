import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, NavigationEnd, Router } from '@angular/router';


import { AuthService } from '.././auth.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './app-navbar.component.html',
  styleUrls: ['./app-navbar.component.css']
})
export class AppNavbarComponent implements OnInit {
  isLoggedIn:boolean;
  //title = 'சிலாக்கி.. டும்';
  title = "विकिपीडिया == தமிழ் == پنجابی‬,";
  constructor(public authService: AuthService,public router:Router) { }

  ngOnInit() {
    console.log("===================in Nav Bar Component");
    this.isLoggedIn=this.authService.isLoggedIn;
    //this.router.navigate(['/lhsnav']);
  }

}
