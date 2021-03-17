import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ForexModule } from 'projects/forex/src/public-api';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ForexModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
