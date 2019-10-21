import { Component, OnInit, Renderer2, Inject } from '@angular/core';
declare function initJsFromTs(): any;

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

    constructor() {

  }

  ngOnInit() {
    initJsFromTs();
  }

}
