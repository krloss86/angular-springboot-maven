import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContactoComponent } from './contacto/contacto.component';
import { SaldoComponent } from './saldo/saldo.component';
import { RecomendacionComponent } from './recomendacion/recomendacion.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';
import { TopbarComponent } from './topbar/topbar.component';
import { RecomendacionesComponent } from './recomendaciones/recomendaciones.component';
import { DatosEquipoComponent } from './datos-equipo/datos-equipo.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    ContactoComponent,
    SaldoComponent,
    RecomendacionComponent,
    NavbarComponent,
    HomeComponent,
    FooterComponent,
    TopbarComponent,
    RecomendacionesComponent,
    DatosEquipoComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
