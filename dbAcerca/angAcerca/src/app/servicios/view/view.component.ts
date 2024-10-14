import { Component, OnDestroy, OnInit } from '@angular/core';
import { ServicioAcerca } from '../servicio.acerca';
import { ServiciosService } from '../servicios.service';
import { Observable } from 'rxjs';
import { CommonModule } from '@angular/common';
import { FormControl, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatIconModule } from '@angular/material/icon';
import { MatTableModule } from '@angular/material/table';
import { RIGHT_ARROW } from '@angular/cdk/keycodes';
import { ActivatedRoute } from '@angular/router';

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

  servicios$!: Observable<ServicioAcerca[]>;

  page = new FormControl('0', Validators.required);
  rows = new FormControl('10', Validators.required);

  displayedColumns: string[] = [
    'CLIENTE_ID',
    'CIS',
    'CLIENTE_SERVICIO_ID',
    'TIPO_DOC',
    'NUMERO_DOC',
    'Nombre_cliente',
    'nombre_titular',
    'DIRECCION',
    'DIRECCION_POSTAL',
    'calle_google'

  ];

  clienteid: string | null = null;

  constructor(
    private serviciosService: ServiciosService,
    private route: ActivatedRoute
  ) {

  }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      this.clienteid = params.get('clienteid');
      if (this.clienteid) {
        this.loadDataByClienteId(this.clienteid as unknown as number);
      }
    });
  }

  ngOnDestroy(): void {

  }

  loadData(): void {

    const page = Number(this.page.value as string);
    const rows = Number(this.rows.value as string);


    this.servicios$ = this.serviciosService.getPage(page, rows);

  }

  loadDataByClienteId(clienteId: number): void {
    this.servicios$ = this.serviciosService.getByClienteId(clienteId);
  }
}
