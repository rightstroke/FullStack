import { Component, OnInit } from '@angular/core';
import { UtilityService } from '../utility.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  users:object[];

  constructor(private uservice:UtilityService) { }

  ngOnInit(): void {
    console.log("================Home Component")
    this.uservice.all().subscribe((res:any)=>{
      this.users=res;
    });
  }

}
