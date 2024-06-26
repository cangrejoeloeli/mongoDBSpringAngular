import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { Observable, catchError, map, of } from 'rxjs';
import { Modulo, Permiso, Role } from './roles';

@Injectable({
  providedIn: 'root'
})
export class RolesService {

  private baseUrl = environment.API_BASE_URL + '/api/roles';

  constructor(private httpClient: HttpClient) { }

  /**
   * Listado total de roles
   * @returns Roles en db
   */
  getRoles(): Observable<Role[]> {
    return this.httpClient.get<Role[]>(this.baseUrl)
      .pipe(
        catchError(() => of()),
      );
  }

  /** obtiene un rol desde el id */
  getRol(id: string): Observable<Role> {
    return this.httpClient.get<Role>(`${this.baseUrl}/${id}`);
  }

  /**
   * Obtiene el listado de permisos disponibles para asignar
   * @returns Lista de permisos disponible para asignar desde la db
   */
  getPermisos(): Observable<Permiso[]> {
    return this.httpClient.get<Permiso[]>(`${environment.API_BASE_URL}` + '/seguridad/permisos').pipe(
      catchError(() => of())
    );
  }

  /**
   * Obtiene los módulos disponibles para asignar
   * 
   * @returns Lista de modulos
   */
  getModulos(): Observable<Modulo[]> {
    return this.httpClient.get<Modulo[]>(`${environment.API_BASE_URL}` + '/seguridad/modulos').pipe(
      catchError(() => of())
    );
  }

}
