import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServiciosService } from '../servicios.service';
import { Observable } from 'rxjs';
import { ServicioAcerca } from '../servicio.acerca';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-one',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './one.component.html',
  styleUrl: './one.component.scss'
})
export class OneComponent implements OnInit {

  servicioid: string | null = null;

  servicio$!: Observable<ServicioAcerca>;

  constructor(
    private serviciosService: ServiciosService,
    private route: ActivatedRoute
  ) {

  }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      this.servicioid = params.get('servicioid');
      if (this.servicioid) {
        this.loadDataByServicioId(this.servicioid as unknown as number);
      }
    });

  }

  loadDataByServicioId(servicioId: number): void {
    this.servicio$ = this.serviciosService.getByServicioId(servicioId);
  }

  keys(servicio: ServicioAcerca): string[] {
    return Object.keys(servicio);
  }
}
