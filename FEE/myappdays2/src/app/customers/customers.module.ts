import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RegistrationComponent } from './registration.component';
import { CustomersRoutingModule } from './customers-routing.module';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [RegistrationComponent],
  imports: [
    CommonModule,
    CustomersRoutingModule,
    FormsModule
  ]
})
export class CustomersModule { }
