import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup, FormControl, Validators } from '@angular/forms';
import { User } from './uimodel/user';
import { Observable }        from 'rxjs/Observable';
import { ActivatedRoute, NavigationEnd, Router } from '@angular/router';

import { AuthService } from './auth.service';

@Component({
  selector: 'my-login',
  templateUrl: './login.component.html',
  styleUrls: [ './login.component.css' ]
})
export class LoginComponent implements OnInit  {
    title:string;
    user:User;
    data1:any;
    users: User[] = [];
    isLoggedIn:boolean;

    loginForm : FormGroup;

    constructor(private authService: AuthService,fb: FormBuilder,private router:Router, private route:ActivatedRoute){
      // Here we are using the FormBuilder to build out our form.
      this.loginForm = fb.group({
      // We can set default values by passing in the corresponding value or leave blank if we wish to not set the value. For our example, we’ll default the gender to female.
        'userid' : [null, Validators.required],
        'password': [null, Validators.compose([Validators.required, Validators.minLength(5), Validators.maxLength(10)])]
      })
      this.title = route.root.firstChild.snapshot.data['title'];
      //router.events
      //  .forEach(e => {
      //    this.title = route.root.firstChild.snapshot.data['title'];
      //});
    }


    ngOnInit(): void {
      console.log("===================in Login Init");
      this.isLoggedIn=false;
    }

    readVal(): string {
      return "Test";
    }


    submitForm(form: any): void{
      console.log('Form Data: ');
      console.log(form);
      console.log("==.."+form['userid']);
      this.data1=form;
      //console.log(form.controls['userid'].value);
      let id = form['userid'];
      console.log("===============ID==" + JSON.stringify(id));
      if (id != "abcd"){
        //throw new Error('Only Interna Users are allowed');
        throw new Error("{'err':'Only Interna Users are allowed','mod':'login'}");
      }

      this.authService.fetchUser(id).subscribe(user => {
        this.user=user;
        console.log("===============IN==" + JSON.stringify(this.user.userid));
        localStorage.setItem('loginSessId', user.userid);
        this.authService.isLoggedIn = true;
        this.isLoggedIn=true;
        //this.router.navigate(['/lhsnav']);
        this.router.navigate(['mainpage']);
      })

      //this.authService.getUsers().subscribe(users=>
      //{
      //    this.users=users.json();
      //    console.log("@@@.." + JSON.stringify(this.users));
      //  });


      //this.authService.fetchUser(form['userid']).then(this.sucessHandle);
      //this.authService.getUsers().then(users => this.users=users);
      //this.authService.getUsers().then(this.sucessHandle);
      //console.log("===============Outside==" + JSON.stringify(this.user));

    }

    private sucessHandle(response:any) {
      console.log("----|--" + JSON.stringify(response));
    }




    // TODO: Remove this when we're done
    get diagnostic() { return JSON.stringify(this.data1); }
}
