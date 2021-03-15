import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { ContentAreaComponent } from './content-area/content-area.component';
import { FundstranferComponent } from './fundstranfer/fundstranfer.component';
import { IntrBankComponent } from './intr-bank/intr-bank.component';
import { SidenavigationComponent } from './sidenavigation/sidenavigation.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SidenavComponent,
    ContentAreaComponent,
    FundstranferComponent,
    IntrBankComponent,
    SidenavigationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
