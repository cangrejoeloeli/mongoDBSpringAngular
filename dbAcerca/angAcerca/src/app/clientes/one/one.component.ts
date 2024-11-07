import { Component, OnInit } from '@angular/core';
import { ClientesService } from '../clientes.service';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { ClientesAcerca } from '../clientes.Acerca';
import { CommonModule } from '@angular/common';
import { MatGridListModule } from '@angular/material/grid-list';

@Component({
  selector: 'app-one',
  standalone: true,
  imports: [
    CommonModule,
    MatGridListModule
  ],
  templateUrl: './one.component.html',
  styleUrl: './one.component.scss'
})
export class OneComponent implements OnInit {

  cliente$!: Observable<ClientesAcerca>;

  clienteid: string | null = null;

  constructor(
    private clientesService: ClientesService,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      this.clienteid = params.get('clienteid');

      if (this.clienteid) {
        this.loadDataByClienteId(this.clienteid as unknown as number);
      }
    }
    );
  }

  loadDataByClienteId(clienteId: number): void {
    this.cliente$ = this.clientesService.getByClienteId(clienteId);
  }

  keys(cliente: ClientesAcerca): string[] {
    return Object.keys(cliente);
  }

}
