import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RolesService } from '../roles.service';
import { CommonModule } from '@angular/common';
import { FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-crud',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './crud.component.html',
  styleUrl: './crud.component.scss'
})
export class CrudComponent implements OnInit {

  rolesForm = this.fb.group({
    name: ['', Validators.required],
    modulosAsignados: this.fb.array([])
  });

  id: string | null = null;
  tipo!: string | null;

  permisos$ = this.rolesService.getPermisos();
  modulos$ = this.rolesService.getModulos();

  constructor(
    private route: ActivatedRoute,
    private rolesService: RolesService,
    private fb: FormBuilder
  ) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get("id");
    this.tipo = this.route.snapshot.paramMap.get("tipo");
  }


}
