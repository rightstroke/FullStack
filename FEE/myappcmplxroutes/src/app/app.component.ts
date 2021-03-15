import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private r:Router){
    //this.r.navigate(["lhsnav"],{queryParams:{id:'test'}});
    //this.r.navigate([{ outlets: { sbar: ['lhsnav','test123'] } }], { skipLocationChange: true });
  }

  //<li class="nav-item active" >
  //          <a class="nav-link" [routerLink]="[{ outlets: { 'sbar': ['lhsnav','fundtransfer'] } }]">FundsTransfer</a>
  //        </li>
  //this.router.navigate(['/products'], { queryParams: { order: 'popular' } });
  //title = 'myappcmplxroute';
}
