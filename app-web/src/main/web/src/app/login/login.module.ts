import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { HomeComponent } from './home';
import { LoginComponent } from './login';
import { RegisterComponent } from './register';
import { AlertComponent } from './_components';
import { ErrorInterceptor, JwtInterceptor } from './_helpers';
import { LoginRoutingModule } from './login-routing.module';
import { fakeBackendProvider } from './_helpers/fake-backend';

@NgModule({
    declarations: [
        HomeComponent,
        LoginComponent,
        RegisterComponent,
        AlertComponent
    ],
    imports: [
        LoginRoutingModule,
        CommonModule,
        RouterModule,
        ReactiveFormsModule,
        HttpClientModule
    ],
    exports: [
        HomeComponent,
        LoginComponent,
        RegisterComponent,
        AlertComponent
    ],
    providers: [
        { provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true },
        { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true },
        // provider used to create fake backend
        // fakeBackendProvider
    ]
})
export class LoginModule {}
