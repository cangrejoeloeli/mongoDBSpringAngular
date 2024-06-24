import { Component, OnDestroy, OnInit } from '@angular/core';
import { RoleService } from './role.service';
import { Modulo, Role } from './role';
import { CommonModule } from '@angular/common';
import { FormArray, FormBuilder, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { ModuloComponent } from './modulo/modulo.component';

@Component({
  selector: 'app-role',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    ModuloComponent
  ],
  templateUrl: './role.component.html',
  styleUrl: './role.component.scss'
})
export class RoleComponent implements OnInit, OnDestroy {

  selectedModulo!: Modulo;

  rolesForm = this.formBuilder.group({
    name: ['', Validators.required],
    modulo: [''],
    modulos: this.formBuilder.array([])
  });

  roles$ = this.roleService.getRoles();
  permisos$ = this.roleService.getPermisos();
  modulos$ = this.roleService.getModulos();

  constructor(
    private formBuilder: FormBuilder,
    private roleService: RoleService) { }

  ngOnDestroy(): void {
    //this.subscription.unsubscribe();
  }

  ngOnInit(): void {
    //this.subscription = this.roleService.getRoles().subscribe(roles => this.roles = roles);

  }

  createRole(name: string): void {
    const newRole: Role = {
      id: '', name: name.trim(),
      modulo: '',
      modulosAsignados: []
    };
    //this.roleService.createRole(newRole).subscribe(role => this.selectedRoles.push(role));
  }

  deleteRole(role: Role): void {
    // this.roleService.deleteRole(role.id).subscribe(() => {
    //   this.selectedRoles = this.selectedRoles.filter(r => r !== role);
    // });
  }

  // Formulario
  get modulos() {
    return this.rolesForm.get('modulos') as FormArray;
  }

  addModulo() {
    this.modulos.push(this.formBuilder.control(this.selectedModulo));

  }


}
