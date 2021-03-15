import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, NavigationEnd, Router,ParamMap } from '@angular/router';

import { MenuService } from '../service/menu.service';
import { AuthService } from '../auth.service';
import { Menu } from '../uimodel/menu';

import 'rxjs/add/operator/switchMap';

const defaultM: Menu[] = [
  { id: 11, name: 'SimpleForm',url:'/simpleform' },
  { id: 12, name: 'ReactiveForm',url:'/reactiveform' },
  { id: 14, name: 'پنجابی‬,',url:'/test4' }
]; //sform

const myforms: Menu[] = [
  { id: 12, name: 'BootStrap',url:'/mybootstrap' },
  { id: 12, name: 'CompSpeak',url:'/component-interaction' },
  { id: 12, name: 'Interceptors',url:'/books-view' },
  { id: 12, name: 'Emit-Catch',url:'/emit-catch' },
  { id: 12, name: 'CustomerLL',url:'/customers' },
  { id: 13, name: 'Directives',url:'/directives' },
  { id: 12, name: 'தமிழ்',url:'/test2' },
  { id: 14, name: 'சிங்கப்பூர்',url:'/test4' }
];

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  isLoggedIn:boolean;
  menu:Menu;
  menues = defaultM;
  type:string;

  selectedMenu: Menu;
  constructor(public menuService: MenuService,public authService: AuthService,public router:Router,public route: ActivatedRoute) { }

  ngOnInit() {
    console.log("===================in Side Bar Component" + JSON.stringify(this.menues));
    this.isLoggedIn=this.authService.isLoggedIn;

    //this.route.paramMap.switchMap((params: ParamMap) => this.type =  params.get('id'));

    this.route.params.subscribe(params => {
       this.type = params['id']||''; // (+) converts string 'id' to a number
       console.log("===================input.."+this.type);
       // In a real app: dispatch action to load the details here.
       if (this.type=="myforms"){
        this.menues = myforms;
      }else{
        this.menues = defaultM;
      }
    });

    //this.route.queryParams.subscribe(params=>{
    //  this.type = params['id']||0;
    //  console.log("===================input.."+this.type);
    //})


  }

  onSelect(menu: Menu): void {
    this.selectedMenu = menu;
  }




  //this.menuService.fetchMenus("id").subscribe(menu => {
  //  this.menu=menu;
  //  console.log("===============IN==" + JSON.stringify(this.menu));
    //localStorage.setItem('loginSessId', user.userid);
    //this.authService.isLoggedIn = true;
    //this.isLoggedIn=true;
    //this.router.navigate(['mainpage']);
  //})





}
