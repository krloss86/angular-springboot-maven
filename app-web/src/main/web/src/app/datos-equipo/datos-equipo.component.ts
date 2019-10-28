import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-datos-equipo',
  templateUrl: './datos-equipo.component.html',
  styleUrls: ['./datos-equipo.component.css']
})
export class DatosEquipoComponent implements OnInit {

  @Input()
  equipo: Equipo;

  constructor() { }

  ngOnInit() {
  }

}
