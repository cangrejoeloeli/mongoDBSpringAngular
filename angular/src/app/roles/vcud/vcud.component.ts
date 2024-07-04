import { Component, model, OnDestroy, OnInit } from '@angular/core';
import { RolesService } from '../roles.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Form, FormArray, FormBuilder, FormControl, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ModulosPermisosAsignados, Permiso, Role } from '../roles';
import { map, Subscription } from 'rxjs';

@Component({
  selector: 'app-vcud',
  standalone: true,
  imports: [
    CommonModule, FormsModule, ReactiveFormsModule
  ],
  templateUrl: './vcud.component.html',
  styleUrl: './vcud.component.scss'
})
export class VcudComponent implements OnInit, OnDestroy {

  /** formulario para el rol */
  formRole!: FormGroup;

  /** id del rol */
  id: string | null = null;

  /** tipo de uso para el modulo C U D V create, update, delete, view */
  tipo!: string | null;

  /** rol para trabajo, sea nuevo o con datos */
  currentRol$!: Role;
  currentRolSubscription!: Subscription;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private fb: FormBuilder,
    private rolesService: RolesService
  ) { }

  ngOnInit(): void {
    //Traigo los parámetros de la ruta
    this.id = this.route.snapshot.paramMap.get("id");
    this.tipo = this.route.snapshot.paramMap.get("tipo");

    this.currentRolSubscription = this.rolesService.getRol(this.id as string).pipe(
      map(rta => this.currentRol$ = rta),
      // map(() => console.log('Rol actual', this.currentRol$)),
      map(() => {
        /** Creo el form */
        this.formRole = this.fb.group({
          id: [''], //id
          name: [''], // nombre del rol
          modulosAsignados: this.fb.array([])
        });
        //Para cada modulo creo la data
        /** paso por cada modulo asignado y lo llamo módulo */
        this.currentRol$.modulosAsignados.forEach((mods: any) => {
          /** modulo */
          const moduloControl = this.fb.group({ modulo: [''], permisos: this.fb.array([]) });
          /** obtengo el arreglo del group */
          const modArra = moduloControl.get('permisos') as FormArray;
          /** paso por cada permiso */
          mods.permisos.forEach(() => {
            /** agrago al arreglo del group */
            modArra.push(this.fb.group({ id: [''], nombrePermiso: [''] }));
          });
          /** agrego al formulario */
          this.modulosAsignados.push(moduloControl);

        });
      }),
      map(() => this.formRole.patchValue(this.currentRol$)),
    ).subscribe();

  }

  /** Formulario para obtener los controles y operar */
  get modulosAsignados() {
    return this.formRole.get('modulosAsignados') as FormArray;
  }

  ngOnDestroy(): void {
    //Verifico si está suscripto, ya q el new no lo hace.
    if (this.currentRolSubscription)
      this.currentRolSubscription.unsubscribe();

  }

  /** Listado de permisos disponibles en db */
  permisos$ = this.rolesService.getPermisos();

  /** Listado de módulos disponibles en db */
  modulos$ = this.rolesService.getModulos();

  /** para volver a grilla */
  goGrilla(): void {
    this.router.navigate(['/roles']);
  }
}
