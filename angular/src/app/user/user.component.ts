import { Component } from '@angular/core';
import { UserService } from './user.service';
import { User } from './user';
import { CommonModule } from '@angular/common';
import { RoleService } from '../role/role.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule
  ],
  templateUrl: './user.component.html',
  styleUrl: './user.component.scss'
})
export class UserComponent {

  // users: User[] = [];
  // roles: Role[] = [];

  users$ = this.userService.users$;
  roles$ = this.roleService.getRoles();

  selectedUser: User = {
    id: '',
    username: '',
    password: '',
    roles: [],
    nombre: ''
  };
  isNewUser: boolean = true;

  constructor(
    private userService: UserService,
    private roleService: RoleService
  ) { }

  createUser(): void {
    this.selectedUser.id = null;
    this.userService.createUser(this.selectedUser).subscribe(user => {
      //this.users.push(user);
      this.resetSelectedUser();
    });
  }

  updateUser(): void {
    this.userService.updateUser(this.selectedUser.id as string, this.selectedUser).subscribe(user => {
      // const index = this.users.findIndex(u => u.id === user.id);
      // if (index !== -1) {
      //   this.users[index] = user;
      // }
      this.resetSelectedUser();
    });
  }

  deleteUser(user: User): void {
    // this.userService.deleteUser(user.id).subscribe(() => {
    //   this.users = this.users.filter(u => u !== user);
    // });
  }

  editUser(user: User): void {
    this.selectedUser = { ...user };
    this.isNewUser = false;
  }

  resetSelectedUser(): void {
    this.selectedUser = {
      id: null,
      username: '',
      password: '',
      roles: [],
      nombre: ''
    };
    this.isNewUser = true;
  }

  saveUser(): void {
    if (this.isNewUser) {
      this.createUser();
    } else {
      this.updateUser();
    }
  }

}
