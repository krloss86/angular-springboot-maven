import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ClienteService } from './../cliente.service';
import { ClienteDataService } from './../services/cliente-data-service.service';
import { AlertService } from '../login/_services';

@Component({
  selector: 'app-topbar',
  templateUrl: './topbar.component.html',
  styleUrls: ['./topbar.component.css']
})
export class TopbarComponent implements OnInit {

  searchForm: FormGroup;

  loading = false;
  submitted = false;

  constructor(
    private clienteService: ClienteService,
    private clienteDataService: ClienteDataService,
    private formBuilder: FormBuilder,
    private alserService: AlertService
  ) {
    this.searchForm = this.buildSearchForm();
  }

  ngOnInit() {
  }

  buildSearchForm(): FormGroup {
    return this.formBuilder.group(
      {
        numeroTelefono: ['', Validators.required],
      }
    );
  }

  executeSearch(): void {
    this.submitted = true;
    this.loading = true;
    if (!this.searchForm.invalid) {
      this.clienteService.search(this.searchForm.get('numeroTelefono').value).subscribe(
        data => {
          this.clienteDataService.updateCliente(data);
          this.loading = false;
        }, error => {
          this.loading = false;
        }
      );
    } else {
      console.log('form invalido');
    }
  }

  resetSearch(): void {
    this.searchForm.reset();
    this.clienteDataService.clear();
    this.alserService.clear();
  }

  // convenience getter for easy access to form fields
  get f() { return this.searchForm.controls; }
}
