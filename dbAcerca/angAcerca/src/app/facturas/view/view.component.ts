import { Component, OnDestroy, OnInit } from '@angular/core';
import { FacturasService } from '../facturas.service';
import { Subscription } from 'rxjs';
import { CommonModule } from '@angular/common';
import { FacturaAcerca } from '../factura';
import { MatTableModule } from '@angular/material/table';
import { MatFormField } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { FormControl, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatGridListModule } from '@angular/material/grid-list';

@Component({
  selector: 'app-view-facturas',
  standalone: true,
  imports: [
    CommonModule,
    MatTableModule,
    MatFormField,
    MatInputModule,
    MatIconModule,
    MatGridListModule,
    FormsModule,
    ReactiveFormsModule,
    MatButtonModule
  ],
  templateUrl: './view.component.html',
  styleUrl: './view.component.scss'
})
export class ViewComponent implements OnInit, OnDestroy {

  obj!: FacturaAcerca[];

  susc!: Subscription;

  displayedColumns: string[] = ['CLIENTE_ID', 'CLIENTE_SERVICIO_ID', 'PERIODO', 'CIS', 'TIPO', 'NUMERO_FACTURA', 'Neto', 'IVA_1'];

  nroServicio = new FormControl('', Validators.required)

  constructor(
    private facturasService: FacturasService
  ) { }

  ngOnInit(): void {

  }

  ngOnDestroy(): void {
    if (this.susc && !this.susc.closed)
      this.susc.unsubscribe();
  }

  loadData(): void {
    const nroServicio = this.nroServicio.value as string;

    if (this.susc && !this.susc.closed)
      this.susc.unsubscribe();

    this.susc = this.facturasService.getBy_nroServicio(Number(nroServicio))
      .subscribe((data: any) => this.obj = data)
  }

}
