import { Router } from '@angular/router';
import { AuthenticationService } from './../login/_services/authentication.service';
import { Component, OnInit, Renderer2, Inject } from '@angular/core';
declare function initJsFromTs(): any;

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router, private authenticationService: AuthenticationService) {

  }

  ngOnInit() {
    initJsFromTs();
  }

  executeLogout() {
    this.authenticationService.logout();
    this.router.navigate(['/login']);
  }

}
