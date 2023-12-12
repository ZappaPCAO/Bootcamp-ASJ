import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PrimerComponenteComponent } from './components/primer-componente/primer-componente.component';
import { ListaComponent } from './components/lista/lista.component';
import { ListadoDeImagenesComponent } from './components/listado-de-imagenes/listado-de-imagenes.component';

@NgModule({
  declarations: [
    AppComponent,
    PrimerComponenteComponent,
    ListaComponent,
    ListadoDeImagenesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
