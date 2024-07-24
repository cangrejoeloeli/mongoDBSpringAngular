import { Component, OnDestroy, OnInit } from '@angular/core';
import { ServicioAcerca } from '../servicio.acerca';
import { ServiciosService } from '../servicios.service';
import { Subscription } from 'rxjs';
import { CommonModule } from '@angular/common';
import { FormControl, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatIconModule } from '@angular/material/icon';
import { MatTableModule } from '@angular/material/table';

@Component({
  selector: 'app-view-servicios',
  standalone: true,
  imports: [
    CommonModule,
    MatTableModule,
    MatInputModule,
    MatIconModule,
    MatButtonModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  templateUrl: './view.component.html',
  styleUrl: './view.component.scss'
})
export class ViewComponent implements OnInit, OnDestroy {

  servicios!: ServicioAcerca[];

  susc!: Subscription;

  page = new FormControl('0', Validators.required);
  rows = new FormControl('10', Validators.required);

  displayedColumns: string[] = ['CLIENTE_ID', 'CLIENTE_SERVICIO_ID', 'TIPO_DOC', 'NUMERO_DOC'];

  constructor(
    private serviciosService: ServiciosService
  ) {

  }

  ngOnInit(): void {

  }

  ngOnDestroy(): void {
    if (this.susc && !this.susc.closed)
      this.susc.unsubscribe();
  }

  loadData(): void {

    const page = Number(this.page.value as string);
    const rows = Number(this.rows.value as string);

    if (this.susc && !this.susc.closed)
      this.susc.unsubscribe();

    this.susc = this.serviciosService.getPage(page, rows).subscribe((data: ServicioAcerca[]) => this.servicios = data);
  }

}
