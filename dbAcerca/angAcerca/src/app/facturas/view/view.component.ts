import { Component, OnDestroy, OnInit } from '@angular/core';
import { FacturasService } from '../facturas.service';
import { Observable, Subscription } from 'rxjs';
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

  facturas$!: Observable<FacturaAcerca[]>;

  displayedColumns: string[] = ['CLIENTE_ID', 'CLIENTE_SERVICIO_ID', 'PERIODO', 'CIS', 'TIPO', 'NUMERO_FACTURA', 'Neto', 'IVA_1'];

  nroServicio = new FormControl('', Validators.required)

  constructor(
    private facturasService: FacturasService
  ) { }

  ngOnInit(): void {

  }

  ngOnDestroy(): void {

  }

  loadData(): void {
    const nroServicio = this.nroServicio.value as string;
    this.facturas$ = this.facturasService.getBy_nroServicio(Number(nroServicio));

  }

}
