import { Component, OnDestroy, OnInit } from '@angular/core';
import { RoleService } from './role.service';
import { Modulo, ModulosPermisosAsignados, Role } from './role';
import { CommonModule } from '@angular/common';
import { FormArray, FormBuilder, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { ModuloPermisosComponent } from './modulo-permisos/modulo-permisos.component';

@Component({
  selector: 'app-role',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    ModuloPermisosComponent
  ],
  templateUrl: './role.component.html',
  styleUrl: './role.component.scss'
})
export class RoleComponent implements OnInit, OnDestroy {

  selectedModulo: Modulo | null = null;

  rolesForm = this.formBuilder.group({
    name: ['', Validators.required],
    modulosAsignados: this.formBuilder.array([])
  });

  //roles$ = this.roleService.getRoles();
  permisos$ = this.roleService.getPermisos();
  modulos$ = this.roleService.getModulos();

  constructor(
    private formBuilder: FormBuilder,
    private roleService: RoleService) { }

  ngOnDestroy(): void {

  }

  ngOnInit(): void {

  }

  createRole(): void {

    const newRole: Role = {
      id: null, name: this.rolesForm.value.name ? this.rolesForm.value.name : '',
      modulosAsignados: []
    };



    //this.roleService.createRole(newRole).subscribe();
  }

  deleteRole(role: Role): void {
    // this.roleService.deleteRole(role.id).subscribe(() => {
    //   this.selectedRoles = this.selectedRoles.filter(r => r !== role);
    // });
  }

  // Formulario
  get modulosAsignados() {
    return this.rolesForm.get('modulosAsignados') as FormArray;
  }

  //Agrega el módulo y saca la selección.
  addModulo(): void {
    //convierte al tipo que corresponde.
    const permAsign: ModulosPermisosAsignados = { modulo: this.selectedModulo as Modulo, permisos: [] };
    this.modulosAsignados.push(this.formBuilder.control(permAsign));
    this.selectedModulo = null;
  }

  //Remueve el modulo del index correspondiente
  removeModulo(index: number): void {
    this.modulosAsignados.removeAt(index);
  }

}
