import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { BehaviorSubject, Observable, catchError, map, of, tap } from 'rxjs';
import { Modulo, Permiso, Role } from './roles';

@Injectable({
  providedIn: 'root'
})
export class RolesService {

  /** Para refetch */
  private refetchSubject = new BehaviorSubject(null);

  private baseUrl = environment.API_BASE_URL + '/api/roles';

  constructor(private httpClient: HttpClient) { }

  /** Para obtener el objeto Subject desde afuera */
  get refetch() {
    return this.refetchSubject.asObservable();
  }

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

  /** Crea un nuevo rol */
  createRole(role: Role): Observable<Role> {
    return this.httpClient.post<Role>(`${this.baseUrl}`, role);
  }

  /** Borra el rol */
  deleteRole(id: string): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseUrl}/${id}`)
      .pipe(
        tap(() => this.refetchSubject.next(null)), //refesca el b subject para actualizar lista
        //tap(() => console.log('borrado', id)) Para debug
      );
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
