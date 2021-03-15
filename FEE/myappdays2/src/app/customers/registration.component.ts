import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  public name:string="";

  constructor() { }

  ngOnInit(): void {
    console.log("dsdsdsdsdsdsdsdsd");
  }

}
