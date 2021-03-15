import { Component,OnInit } from '@angular/core';
import { AuthService } from './auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './main-menu.component.html'
})
export class MainMenuComponent implements OnInit {
  title = 'சிலாக்கி.. டும்';
  isLoggedIn:boolean;

  constructor(public authService: AuthService){}


  ngOnInit(): void {
    console.log("===================in Login Init");
    this.isLoggedIn=this.authService.isLoggedIn;
  }

}
