import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ViewComponent } from './view/view.component';
import { CrudComponent } from './crud/crud.component';
import { VcudComponent } from './vcud/vcud.component';

const routes: Routes = [
  { path: '', component: ViewComponent },
  { path: 'crud/:id/:tipo', component: CrudComponent },
  { path: 'vcud/:id/:tipo', component: VcudComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RolesRoutingModule { }
