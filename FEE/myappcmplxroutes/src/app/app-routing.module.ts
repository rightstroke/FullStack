import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { FundstranferComponent } from './fundstranfer/fundstranfer.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { IntrBankComponent } from './intr-bank/intr-bank.component';

const routes: Routes = [
  {path:'',redirectTo:'login',pathMatch:'full'},
  {path:'login',component:LoginComponent},
  {path:'ftransfer',component:FundstranferComponent},
  {path:'lhsnav/:id',component:SidenavComponent,outlet: 'sbar'},
  {path:'intrabank',component:IntrBankComponent}
  
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
