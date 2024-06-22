import { Component, OnDestroy, OnInit } from '@angular/core';
import { RoleService } from './role.service';
import { Role } from './role';
import { CommonModule } from '@angular/common';
import { FormArray, FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-role',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './role.component.html',
  styleUrl: './role.component.scss'
})
export class RoleComponent implements OnInit, OnDestroy {


  rolesForm = this.formBuilder.group({
    name: ['', Validators.required],
    modulo: [''],
    permisos: this.formBuilder.array([])
  });


  roles: Role[] = [];

  roles$ = this.roleService.roles$;
  permisos$ = this.roleService.permisos$;
  modulos$ = this.roleService.modulos$;


  //private subscription!: Subscription;

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
      permisos: []
    };
    this.roleService.createRole(newRole).subscribe(role => this.roles.push(role));
  }

  deleteRole(role: Role): void {
    this.roleService.deleteRole(role.id).subscribe(() => {
      this.roles = this.roles.filter(r => r !== role);
    });
  }

  // Formulario
  get permisos() {
    return this.rolesForm.get('permisos') as FormArray;
  }

  addPermiso() {
    this.permisos.push(this.formBuilder.control(''));
  }
}
