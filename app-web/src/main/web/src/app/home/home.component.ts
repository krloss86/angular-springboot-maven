import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AuthenticationService } from './../login/_services/authentication.service';
import { ClienteDataService } from './../services/cliente-data-service.service';
declare function initJsFromTs(): any;

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  informacionCliente: InformacionCliente;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authenticationService: AuthenticationService,
    private clienteDataService: ClienteDataService
    ) {
      console.log('constructor');
    }

  ngOnInit() {
    console.log('onInit');
    // this.informacionCliente = this.route.snapshot.data.informacionCliente;
    this.clienteDataService.getInformacionCliente().subscribe(
      data => {
        console.log('se ha actualizado los datos');
        this.informacionCliente = data;
      }
    );
    initJsFromTs();
  }

  executeLogout() {
    this.authenticationService.logout();
    this.router.navigate(['/login']);
  }

}
