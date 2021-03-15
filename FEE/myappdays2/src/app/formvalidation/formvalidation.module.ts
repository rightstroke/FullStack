import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule,ReactiveFormsModule }    from '@angular/forms';

import { FormValidationRoutingModule } from './formval-routing.module';

import { SimpleformComponent }  from './simpleform.component';
import { ReactiveformComponent }  from './reactiveform.component';
import { DirectivesComponent } from './directives.component';
import { AlertDirective } from './alert.directives';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    FormValidationRoutingModule,
    ReactiveFormsModule
  ],
  declarations: [SimpleformComponent,ReactiveformComponent,DirectivesComponent,AlertDirective]
})
export class FormvalidationModule { }
