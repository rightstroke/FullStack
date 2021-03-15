import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-content-area',
  templateUrl: './content-area.component.html',
  styleUrls: ['./content-area.component.css']
})
export class ContentAreaComponent implements OnInit {

  constructor(public auth:AuthService) { 
    console.log("AUTH.................." + auth.isLoggedin);
  }

  public menus:Array<any> = [
    {path:'login',description:'Login'},
    {path:'ftransfer',description:'FundsTransfer'}
  ]

  ngOnInit(): void {
  }

}
