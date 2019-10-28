import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClienteInformacionResolve } from './cliente.service';
import { HomeComponent } from './home/home.component';
import { AuthGuard } from './login/_helpers/auth.guard';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: '/home'},
  { path: 'home', component: HomeComponent, canActivate: [AuthGuard],
    resolve : {
      informacionCliente: ClienteInformacionResolve
    }
  },
  // { path: '**', component: NoEncontradoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { scrollPositionRestoration: 'enabled', useHash: true, enableTracing: false })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
