import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProyectoUnoComponent } from './components/proyecto-uno/proyecto-uno.component';
import { ProyectoDosComponent } from './components/proyecto-dos/proyecto-dos.component';
import { InicioComponent }  from './components/inicio/inicio.component';
import { ProyectoTresComponent } from './components/proyecto-tres/proyecto-tres.component';
import { CardRickandmortyComponent } from './components/card-rickandmorty/card-rickandmorty.component';
import { PipesTestComponent } from './components/pipes-test/pipes-test.component';

const routes: Routes = [
  {path: `proyecto-uno`, component:ProyectoUnoComponent},
  {path: `proyecto-dos`, component:ProyectoDosComponent},
  {path: `proyecto-tres`, 
  children:[
    {path: ``, component:ProyectoTresComponent},
    {path: `pj/:id`, component: CardRickandmortyComponent},
    {path: `**`, component:ProyectoTresComponent},
  ]
  },
  {path: `inicio`, component: InicioComponent},
  {path: ``, component: PipesTestComponent},
  {path: `**`, component: InicioComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
