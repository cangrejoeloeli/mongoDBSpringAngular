import { Component, Input, OnInit } from '@angular/core';
import { Modulo, ModulosPermisosAsignados, Permiso } from '../role';
import { RoleService } from '../role.service';
import { ControlContainer, FormArray, FormBuilder, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

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
export class ModuloPermisosComponent {

  @Input() modulosAsignados!: FormGroup;

  permisos$ = this.roleService.getPermisos();

  permisoSelected: Permiso | null = null;

  constructor(
    private fb: FormBuilder,
    private roleService: RoleService
  ) { }

  get permisosAsignados() {
    return this.modulosAsignados.get('permisos') as FormArray;
  }

  addPermiso(): void {
    this.permisosAsignados.push(this.fb.control(this.permisoSelected));
    this.permisoSelected = null;
  }

  removePermiso(): void {

  }

}
