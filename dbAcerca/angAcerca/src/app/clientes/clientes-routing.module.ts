import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ViewComponent } from './view/view.component';
import { OneComponent } from './one/one.component';

const routes: Routes = [
  { path: 'view', component: ViewComponent },
  { path: 'one/:clienteid', component: OneComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ClientesRoutingModule { }
