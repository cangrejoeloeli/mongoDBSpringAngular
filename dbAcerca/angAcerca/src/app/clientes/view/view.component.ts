import { CommonModule } from '@angular/common';
import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Subscription } from 'rxjs';
import { ClientesAcerca } from '../clientes.Acerca';
import { MatTableModule } from '@angular/material/table';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { ClientesService } from '../clientes.service';

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
  ],
  templateUrl: './view.component.html',
  styleUrl: './view.component.scss'
})
export class ViewComponent implements OnInit, OnDestroy {

  susc!: Subscription;

  clientes!: ClientesAcerca[];

  page = new FormControl('0', Validators.required);
  rows = new FormControl('10', Validators.required);

  displayedColumns: string[] = ['CLIENTE_ID', 'APELLIDO_NOMBRES_RAZON_SOCIAL', 'TIPO_DOC', 'NUMERO_DOC'];

  constructor(
    private clientesService: ClientesService
  ) { }

  ngOnInit(): void {

  }

  ngOnDestroy(): void {
    if (this.susc && !this.susc.closed) this.susc.unsubscribe;
  }

  loadData(): void {
    if (this.susc && !this.susc.closed) this.susc.unsubscribe;

    const page = Number(this.page.value as string);
    const rows = Number(this.rows.value as string);

    this.susc = this.clientesService.getPage(page, rows).subscribe(
      (data: ClientesAcerca[]) => this.clientes = data
    )
  }

}
