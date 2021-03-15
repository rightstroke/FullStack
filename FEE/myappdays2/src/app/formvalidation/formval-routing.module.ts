import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { SimpleformComponent }    from './simpleform.component';
import { ReactiveformComponent }  from './reactiveform.component';
import { DirectivesComponent }  from './directives.component';

const formValRoutes: Routes = [
  { path: 'simpleform',  component: SimpleformComponent },
  { path: 'reactiveform',  component: ReactiveformComponent },
  { path: 'directives', component:DirectivesComponent}
];

@NgModule({
  imports: [
    RouterModule.forChild(formValRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class FormValidationRoutingModule { }
