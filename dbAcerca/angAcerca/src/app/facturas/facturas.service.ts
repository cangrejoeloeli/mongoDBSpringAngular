import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { FacturaAcerca } from './factura';

@Injectable({
  providedIn: 'root'
})
export class FacturasService {

  constructor(
    private httpClient: HttpClient
  ) { }

  public getBy_nroServicio(nroServicio: number): Observable<FacturaAcerca[]> {
    return this.httpClient.get<FacturaAcerca[]>('/api/facturas/porservicio?nroServicio=' + nroServicio);
  }
}
