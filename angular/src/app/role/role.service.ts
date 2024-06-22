import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Modulo, Permiso, Role } from './role';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class RoleService {
  private baseUrl = environment.API_BASE_URL + '/roles';
  // Observable publico para lista de roles.
  roles$ = this.http.get<Role[]>(`${this.baseUrl}`); // this.getRoles();

  permisos$ = this.http.get<Permiso[]>(`${environment.API_BASE_URL}` + '/security/permisos');
  modulos$ = this.http.get<Modulo[]>(`${environment.API_BASE_URL}` + '/security/modulos');

  constructor(private http: HttpClient) { }

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
