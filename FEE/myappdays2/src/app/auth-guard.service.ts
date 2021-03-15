import { Injectable } from '@angular/core';
import {
  CanActivate, Router,
  ActivatedRouteSnapshot,
  RouterStateSnapshot,
  CanActivateChild,
  NavigationExtras,
  CanLoad, Route
} from '@angular/router';
import { AuthService } from './auth.service';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class AuthGuard implements CanActivate {
  constructor(private authService: AuthService, private router: Router) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<boolean> | Promise<boolean> | boolean {
    //let url: string = state.url;
    console.log("Valid Route1...." + this.authService.isLoggedIn);
    if (!this.authService.isLoggedIn){
      alert("Please login first,redirecting...");
      this.router.navigate(['login']);
    }
    return true;
    //return this.router.navigate(['mainpage']);
  }




}
