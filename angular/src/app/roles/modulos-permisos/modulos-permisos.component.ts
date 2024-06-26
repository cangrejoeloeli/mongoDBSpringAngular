import { Component, Input } from '@angular/core';
import { ModulosPermisosAsignados, Permiso } from '../roles';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { RolesService } from '../roles.service';

@Component({
  selector: 'app-modulos-permisos',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule
  ],
  templateUrl: './modulos-permisos.component.html',
  styleUrl: './modulos-permisos.component.scss'
})
export class ModulosPermisosComponent {
  @Input() moduloAsignado!: ModulosPermisosAsignados;

  permisos$ = this.roleService.getPermisos();

  permisoSelected: Permiso | null = null;

  constructor(private roleService: RolesService) { }

  addPermiso(): void {
    if (this.permisoSelected) {
      this.moduloAsignado.permisos.push(this.permisoSelected);
      this.permisoSelected = null;
    }
  }

  removePermiso(item: Permiso): void {
    const index = this.moduloAsignado.permisos.indexOf(item);
    this.moduloAsignado.permisos.splice(index, 1);
  }
}
