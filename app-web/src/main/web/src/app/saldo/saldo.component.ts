import { Component, Input, OnInit } from '@angular/core';
import { ClienteDataService } from './../services/cliente-data-service.service';

@Component({
  selector: 'app-saldo',
  templateUrl: './saldo.component.html',
  styleUrls: ['./saldo.component.css']
})
export class SaldoComponent implements OnInit {

  @Input()
  saldos: Saldos;

  constructor(private clienteDataService: ClienteDataService) { }

  ngOnInit() {
  }

}
