import { Component, Input, OnDestroy, OnInit } from '@angular/core';
import { RoleService } from '../role.service';
import { FormBuilder, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Subscription } from 'rxjs';
import { ModulosPermisosAsignados, Permiso } from '../../roles/roles';

@Component({
  selector: 'app-modulo-permisos',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule

  ],
  templateUrl: './modulo-permisos.component.html',
  styleUrl: './modulo-permisos.component.scss'
})
export class ModuloPermisosComponent implements OnInit, OnDestroy {

  @Input() moduloAsignado!: ModulosPermisosAsignados;

  permisos$ = this.roleService.getPermisos();

  permisoSelected: Permiso | null = null;

  subs$!: Subscription;

  constructor(
    private fb: FormBuilder,
    private roleService: RoleService
  ) { }

  ngOnDestroy(): void { }

  ngOnInit(): void { }

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
