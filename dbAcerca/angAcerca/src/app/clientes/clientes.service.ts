import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ClientesAcerca } from './clientes.Acerca';

@Injectable({
  providedIn: 'root'
})
export class ClientesService {

  constructor(
    private httpClient: HttpClient
  ) { }

  public getPage(page: number, rows: number): Observable<ClientesAcerca[]> {
    return this.httpClient.get<ClientesAcerca[]>('/api/clientes/todos?page=' + page + '&rows=' + rows);
  }

  public getByTitulat(titular: string): Observable<ClientesAcerca[]> {
    return this.httpClient.get<ClientesAcerca[]>('/api/clientes/bytitular?titular=' + titular);
  }

}
