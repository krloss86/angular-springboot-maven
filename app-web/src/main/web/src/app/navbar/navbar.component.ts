// import { DOCUMENT } from '@angular/common';
// import { Component, Inject, ElementRef, OnInit, Renderer2, ViewChild } from '@angular/core';
import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  @ViewChild('navBarMenu', {static: false}) navBarMenu: ElementRef;

  navBarExpanded = true;

  /*
  constructor(
    @Inject(DOCUMENT) private document: Document,
    private render: Renderer2,
    ) {
  }
  */
 constructor() {

 }

  ngOnInit() {
  }

  /*
  expandMenu() {
    if (this.navBarExpanded) {

      this.render.addClass(this.document.body, 'sidebar-toggled');

      this.render.addClass(this.navBarMenu.nativeElement, 'toogle');

      this.navBarExpanded = false;
    } else {

      this.render.removeClass(this.document.body, 'sidebar-toggled');

      this.render.removeClass(this.navBarMenu.nativeElement, 'toggle');

      this.navBarExpanded = true;
    }
  }
  */
}
