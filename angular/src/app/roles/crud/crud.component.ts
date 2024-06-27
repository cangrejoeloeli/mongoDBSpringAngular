import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RolesService } from '../roles.service';
import { CommonModule } from '@angular/common';
import { FormArray, FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { ModulosPermisosComponent } from '../modulos-permisos/modulos-permisos.component';
import { Modulo, ModulosPermisosAsignados, Role } from '../roles';
import { Subscription, map } from 'rxjs';
import { __values } from 'tslib';
import { ModuloPermisosComponent } from '../../role/modulo-permisos/modulo-permisos.component';

@Component({
  selector: 'app-crud',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    ModulosPermisosComponent],
  templateUrl: './crud.component.html',
  styleUrl: './crud.component.scss'
})
export class CrudComponent implements OnInit, OnDestroy {

  /** Para manejo de selección de la lista */
  selectedModulo: Modulo | null = null;

  /** Formulario con datos para ADD/UPD */
  rolesForm = this.fb.group({
    id: [''],
    name: ['', Validators.required],
    modulosAsignados: this.fb.array([])
  });

  /** id del rol */
  id: string | null = null;

  /** tipo de uso para el modulo C U D V create, update, delete, view */
  tipo!: string | null;

  /** Listado de permisos disponibles en db */
  permisos$ = this.rolesService.getPermisos();

  /** Listado de módulos disponibles en db */
  modulos$ = this.rolesService.getModulos();

  /** rol para trabajo, sea nuevo o con datos */
  currentRol$!: Role;
  currentRolSubscription!: Subscription;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private rolesService: RolesService,
    private fb: FormBuilder
  ) { }

  ngOnDestroy(): void {
    //Verifico si está suscripto, ya q el new no lo hace.
    if (this.currentRolSubscription)
      this.currentRolSubscription.unsubscribe();
  }

  ngOnInit(): void {

    //Traigo los parámetros de la ruta
    this.id = this.route.snapshot.paramMap.get("id");
    this.tipo = this.route.snapshot.paramMap.get("tipo");

    //según el tipo, cargo el rol. Si es nuevo queda vacío.
    switch (this.tipo) {
      case 'V': case 'U': case 'D':
        this.currentRolSubscription = this.rolesService.getRol(this.id as string).pipe(
          map(rta => this.currentRol$ = rta),
          map(() => console.log('Rol actual', this.currentRol$)),
          map(() => {
            //Para cada modulo creo la data
            this.currentRol$.modulosAsignados.forEach(
              (mod: ModulosPermisosAsignados) => {
                this.modulosAsignados.push(this.fb.control(mod));
              }
            );
          }),
          map(() => this.rolesForm.patchValue(this.currentRol$)),
        ).subscribe();
        break;
      default:
        //no hago nada, es nuevo
        break;
    }
  }

  onSubmit(): void {
    //Cuando es nuevo, debo tener el id como null para que lo cree mongodb

    if (this.tipo === "C") {
      this.rolesForm.patchValue({ id: null });
    }

    const rol: Role = this.rolesForm.value as Role;

    this.rolesService.createRole(rol).subscribe();

    this.router.navigate(['/rolesCRUD']);
  }



  /** Formulario para obtener los controles y operar */
  get modulosAsignados() {
    return this.rolesForm.get('modulosAsignados') as FormArray;
  }

  /** Agrega el módulo y saca la selección de módulo actual. */
  addModulo(): void {
    //convierte al tipo que corresponde.
    const permAsign: ModulosPermisosAsignados = { modulo: this.selectedModulo as Modulo, permisos: [] };
    this.modulosAsignados.push(this.fb.control(permAsign));
    this.selectedModulo = null;
  }

  /** Remueve el modulo del index correspondiente */
  removeModulo(index: number): void {
    this.modulosAsignados.removeAt(index);
  }


}
