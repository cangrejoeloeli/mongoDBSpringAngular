import { Routes } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

export const routes: Routes = [
    { path: "roles", loadChildren: () => import('./role/role.module').then(m => m.RoleModule) },
    { path: "users", loadChildren: () => import('./user/user.module').then(m => m.UserModule) },
    { path: "rolesCRUD", loadChildren: () => import('./roles/roles.module').then(m => m.RolesModule) },
    { path: '', redirectTo: 'roles', pathMatch: 'full' },
    { path: '**', component: PageNotFoundComponent }
];
