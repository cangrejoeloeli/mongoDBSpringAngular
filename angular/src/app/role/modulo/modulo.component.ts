import { Component, Input } from '@angular/core';
import { Modulo } from '../role';
import { CommonModule } from '@angular/common';
import { RoleService } from '../role.service';

@Component({
  selector: 'app-modulo',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './modulo.component.html',
  styleUrl: './modulo.component.scss'
})
export class ModuloComponent {
  @Input() modulo!: Modulo;

  permisos$ = this.roleService.getPermisos();

  constructor(
    private roleService: RoleService
  ) { }
}
