import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent }   from './login.component';
import { MainMenuComponent }   from './main-menu.component';
import { SidebarComponent } from './sidebar/sidebar.component';

import { CanDeactivateGuard }       from './can-deactivate-guard.service';
import { AuthGuard }                from './auth-guard.service';
import { SelectivePreloadingStrategy } from './selective-preloading-strategy';

const routes: Routes = [
  { path: 'login',  component: LoginComponent, data: { title: '..>My Login<..' } },
  { path: 'lhsnav/:id',component: SidebarComponent,outlet: 'sbar'},
  { path: 'mainpage',  component: MainMenuComponent,canActivate: [AuthGuard] },
  { path: 'sform',  redirectTo: '/simpleform' },
  { path: 'sbtstrap',  redirectTo: '/mybootstrap' },
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'customers',  loadChildren: () => import('./customers/customers.module').then(m => m.CustomersModule) }
  
];

@NgModule({
  imports: [ RouterModule.forRoot(
                      routes,
                      {
                        enableTracing: false, // <-- debugging purposes only
                        preloadingStrategy: SelectivePreloadingStrategy,

                      }
    ) ],
  exports: [ RouterModule ],
  providers: [
    CanDeactivateGuard,
    SelectivePreloadingStrategy
  ]
})
export class AppRoutingModule {}
