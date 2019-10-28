import { ClienteDataService } from './../services/cliente-data-service.service';
import { Component, OnInit } from '@angular/core';
import { ClienteService } from './../cliente.service';

@Component({
  selector: 'app-topbar',
  templateUrl: './topbar.component.html',
  styleUrls: ['./topbar.component.css']
})
export class TopbarComponent implements OnInit {

  constructor(private clienteService: ClienteService, private clienteDataService: ClienteDataService) { }

  ngOnInit() {
  }

  executeBuscar(numeroTelefono: string) {
    this.clienteService.search(numeroTelefono).subscribe(
      data => {
        this.clienteDataService.updateCliente(data);
      }
    );
  }
}
