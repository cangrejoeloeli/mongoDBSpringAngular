import { Routes } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HomeComponent } from './home/home.component';

export const routes: Routes = [
    {
        path: 'facturas',
        loadChildren: () => import('./facturas/facturas.module').then(m => m.FacturasModule)
    },
    {
        path: 'servicios',
        loadChildren: () => import('./servicios/servicios.module').then(m => m.ServiciosModule)
    },
    {
        path: 'clientes',
        loadChildren: () => import('./clientes/clientes.module').then(m => m.ClientesModule)
    },
    { path: 'home', component: HomeComponent },
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: '**', component: PageNotFoundComponent }
];
