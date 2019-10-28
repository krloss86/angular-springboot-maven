import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClienteDataService {

  private informacionClienteSubject = new BehaviorSubject<InformacionCliente>(null);

  private currentInformacionCliente: Observable<InformacionCliente> = this.informacionClienteSubject.asObservable();

  private informacionCliente: InformacionCliente;

  constructor() {
  }

  public updateCliente(nuevaInformacionCliente: InformacionCliente) {
    console.log('actualizando InformacionCliente');
    this.informacionClienteSubject.next(nuevaInformacionCliente);
  }

  public getInformacionCliente(): Observable<InformacionCliente> {
    return this.currentInformacionCliente;
  }

  clear() {
    // clear by calling subject.next() without parameters
    this.informacionClienteSubject.next(null);
}
}
