import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Resolve, RouterStateSnapshot } from '@angular/router';
import { Observable } from 'rxjs';
import { environment } from './../environments/environment';
import { ClienteDataService } from './services/cliente-data-service.service';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {
  private urlSearch = environment.apiUrl;
  private endPoint = '/cliente/';
  constructor(private http: HttpClient) { }

  /**
   * Busca datos dado el numero de telefono
   * @param querySearch texto buscado
   */
  search(numeroTelefono: string): Observable<InformacionCliente> {
    return this.http.get<InformacionCliente>(this.urlSearch + this.endPoint + numeroTelefono);
  }
}

@Injectable({
  providedIn: 'root'
})
export class ClienteInformacionResolve implements Resolve<InformacionCliente> {

  constructor(private clienteService: ClienteService, private clienteDataService: ClienteDataService) {
    console.log('creando ClienteInformacionResolve');
   }

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<InformacionCliente> | InformacionCliente {

    this.clienteDataService.updateCliente(this.clienteDataService.datosVacios);

    const numeroTelefono = route.params.numeroTelefono;

    if (numeroTelefono) {
      return this.clienteService.search(numeroTelefono);
    } else {
      return this.clienteDataService.datosVacios;
    }

  }
}
