import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError, of } from 'rxjs';
import { environment } from '../../environments/environment';
import { Modulo, Permiso, Role } from '../roles/roles';

@Injectable({
  providedIn: 'root'
})
export class RoleService {
  private baseUrl = environment.API_BASE_URL + '/api/roles';

  constructor(private http: HttpClient) { }

  getRoles(): Observable<Role[]> {
    return this.http.get<Role[]>(`${this.baseUrl}`).pipe(catchError(() => of()));
  }

  getPermisos(): Observable<Permiso[]> {
    return this.http.get<Permiso[]>(`${environment.API_BASE_URL}` + '/seguridad/permisos').pipe(
      catchError(() => of())
    );
  }

  getModulos(): Observable<Modulo[]> {
    return this.http.get<Modulo[]>(`${environment.API_BASE_URL}` + '/seguridad/modulos').pipe(
      catchError(() => of())
    );
  }

  createRole(role: Role): Observable<Role> {
    return this.http.post<Role>(`${this.baseUrl}`, role);
  }

  updateRole(id: string, role: Role): Observable<Role> {
    return this.http.put<Role>(`${this.baseUrl}/${id}`, role);
  }

  deleteRole(id: string): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }


}
