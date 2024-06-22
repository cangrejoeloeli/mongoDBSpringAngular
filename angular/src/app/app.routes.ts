import { Routes } from '@angular/router';

export const routes: Routes = [
    { path: "roles", loadChildren: () => import('./role/role.module').then(m => m.RoleModule) },
    { path: "users", loadChildren: () => import('./user/user.module').then(m => m.UserModule) }
];
