import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RolesService } from '../roles.service';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-view',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule
  ],
  templateUrl: './view.component.html',
  styleUrl: './view.component.scss'
})
export class ViewComponent {

  roles$ = this.rolesService.getRoles();

  constructor(private rolesService: RolesService) { }

}
