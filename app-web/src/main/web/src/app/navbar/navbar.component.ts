import { Component, ElementRef, OnInit, Renderer2, ViewChild } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  @ViewChild('navBarMenu', {static: false}) navBarMenu: ElementRef;

  navBarExpanded = false;

  constructor(private render: Renderer2) {

  }

  ngOnInit() {
  }

  expandMenu() {
    this.navBarExpanded = !this.navBarExpanded;
    if (this.navBarExpanded) {
      this.render.addClass(this.navBarMenu.nativeElement, 'expand');
    } else {
      this.render.removeClass(this.navBarMenu.nativeElement, 'expand');
    }
    // this.render.addClass(this.navBarMenu.nativeElement, 'animated');
    // this.render.addClass(this.navBarMenu.nativeElement, 'fadeInLeft');
  }
}
