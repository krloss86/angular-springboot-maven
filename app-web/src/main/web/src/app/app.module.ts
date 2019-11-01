import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContactoComponent } from './contacto/contacto.component';
import { DatosEquipoComponent } from './datos-equipo/datos-equipo.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { LoginModule } from './login/login.module';
import { NavbarComponent } from './navbar/navbar.component';
import { RecomendacionComponent } from './recomendacion/recomendacion.component';
import { SaldoComponent } from './saldo/saldo.component';
import { TopbarComponent } from './topbar/topbar.component';
import { NoEncontradoComponent } from './no-encontrado/no-encontrado.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';

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
    DatosEquipoComponent,
    NoEncontradoComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    LoginModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
