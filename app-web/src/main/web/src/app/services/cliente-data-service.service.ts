import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClienteDataService {
  public datosVacios = {
    saldos: {datosSaldos: []},
    equipo: {datosEquipo: []},
    cliente: {contactos: []},
    recomendaciones: { recomendaciones: []}
  };

  private informacionClienteSubject = new BehaviorSubject<InformacionCliente>(null);

  private currentInformacionCliente: Observable<InformacionCliente> = this.informacionClienteSubject.asObservable();

  constructor() {
  }

  public updateCliente(nuevaInformacionCliente: InformacionCliente) {
    // console.log('actualizando InformacionCliente');
    this.informacionClienteSubject.next(nuevaInformacionCliente);
  }

  public getInformacionCliente(): Observable<InformacionCliente> {
    return this.currentInformacionCliente;
  }

  public clear(): void {
    // clear by calling subject.next() without parameters
    this.informacionClienteSubject.next(this.datosVacios);
  }
}
