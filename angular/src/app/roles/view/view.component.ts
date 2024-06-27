import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { RolesService } from '../roles.service';
import { RouterModule } from '@angular/router';
import { Observable, switchMap } from 'rxjs';
import { Role } from '../roles';

@Component({
  selector: 'app-view',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule
  ],
  templateUrl: './view.component.html',
  styleUrl: './view.component.scss'
})
export class ViewComponent implements OnInit {

  /** Listado de roles */
  //roles$ = this.rolesService.getRoles();
  roles$!: Observable<Role[]>;

  constructor(private rolesService: RolesService) { }

  ngOnInit(): void {
    // Cuando se actualiza el refecth del servicio se actualiza acá
    this.roles$ = this.rolesService.refetch.pipe(
      switchMap(() => this.rolesService.getRoles())
    );
  }

  /** borra el rol seleccionado */
  deleteRole(id: string | null): void {
    if (id)
      this.rolesService.deleteRole(id).subscribe();
  }

}
