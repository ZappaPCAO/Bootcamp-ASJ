import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProyectoUnoComponent } from './components/proyecto-uno/proyecto-uno.component';
import { ProyectoDosComponent } from './components/proyecto-dos/proyecto-dos.component';
import { InicioComponent }  from './components/inicio/inicio.component';

const routes: Routes = [
  {path: `proyecto-uno`, component:ProyectoUnoComponent},
  {path: `proyecto-dos`, component:ProyectoDosComponent},
  {path: `inicio`, component: InicioComponent},
  {path: ``, component: InicioComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
