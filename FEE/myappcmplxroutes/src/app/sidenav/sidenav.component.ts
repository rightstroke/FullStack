import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, NavigationEnd, ParamMap,Router } from '@angular/router';
import { AuthService } from '../auth.service';

//import 'rxjs/add/operator/switchMap'

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent implements OnInit {

  type:string;

  constructor(public route: ActivatedRoute,public auth:AuthService,public r:Router) {
    console.log("==================sidenav constructor");
    this.sidemenus = this.sidemenusft;
   }

  public sidemenus:Array<any> = []

  private sidemenusft:Array<any> = [
    {path:'/intrabank',description:'With-In-Bank'},
    {path:'/outbank',description:'Outside-Bank'},
    {path:'/outcountry',description:'Outside-CountryBank'},
  ]

  private sidemenusdemat:Array<any> = [
    {path:'/itstocks',description:'ITStocks'},
    {path:'/liquidity',description:'MoneyMarket'},
    {path:'/commodity',description:'Commodity'},
  ]


  ngOnInit(): void {
    //http://localhost:4200/lhsnav?id=fundstransfer
    //http://localhost:4200/lhsnav?id=Demat
    this.route.params.subscribe(params => {
      this.type = params['id']||''; // (+) converts string 'id' to a number
      console.log("===================input.."+this.type);
      // In a real app: dispatch action to load the details here.
      if (this.type=="fundtransfer"){
       this.sidemenus = this.sidemenusft;
      
     }else{
       this.sidemenus = this.sidemenusdemat;
     }
     console.log(this.sidemenus);
     this.r.navigate(["ftransfer"]);
    
   });
  }



}
