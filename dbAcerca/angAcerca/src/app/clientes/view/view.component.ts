import { CommonModule } from '@angular/common';
import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Observable, Subscription } from 'rxjs';
import { ClientesAcerca } from '../clientes.Acerca';
import { MatTableModule } from '@angular/material/table';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { ClientesService } from '../clientes.service';
import { MatCardModule } from '@angular/material/card';

@Component({
  selector: 'app-view-clientes',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    MatTableModule,
    MatInputModule,
    MatButtonModule,
    MatCardModule,

  ],
  templateUrl: './view.component.html',
  styleUrl: './view.component.scss'
})
export class ViewComponent implements OnInit, OnDestroy {

  /** listado de clientes */
  clientes$!: Observable<ClientesAcerca[]>;

  page = new FormControl('0', Validators.required);
  rows = new FormControl('10', Validators.required);

  titular = new FormControl('', Validators.required);

  displayedColumns: string[] = ['CLIENTE_ID', 'NUMERADOR_HIJOS', 'APELLIDO_NOMBRES_RAZON_SOCIAL', 'TIPO_DOC', 'NUMERO_DOC'];

  constructor(
    private clientesService: ClientesService
  ) { }

  ngOnInit(): void {

  }

  ngOnDestroy(): void {

  }

  loadData(): void {

    const page = Number(this.page.value as string);
    const rows = Number(this.rows.value as string);

    this.clientes$ = this.clientesService.getPage(page, rows);
  }

  loadByTitular(): void {
    this.clientes$ = this.clientesService.getByTitulat(this.titular.value as string);
  }

}
