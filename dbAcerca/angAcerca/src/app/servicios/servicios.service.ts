import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ServicioAcerca } from './servicio.acerca';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiciosService {

  constructor(
    private httpClient: HttpClient
  ) { }

  public getPage(page: number, rows: number): Observable<ServicioAcerca[]> {
    return this.httpClient.get<ServicioAcerca[]>('/api/servicios/todos?page=' + page + '&rows=' + rows);
  }

  public getByClienteId(clienteId: number): Observable<ServicioAcerca[]> {
    return this.httpClient.get<ServicioAcerca[]>('/api/servicios/byclienteid?clienteid=' + clienteId);
  }
}
