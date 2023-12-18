import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'
import { HttpClientModule } from '@angular/common/http';

// COMPONENTS
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { MainComponent } from './components/main/main.component';
import { AsideComponent } from './components/aside/aside.component';
import { ListadoSimsonsComponent } from './components/listado-simsons/listado-simsons.component';
import { FormularioSimpsonsComponent } from './components/formulario-simpsons/formulario-simpsons.component';
import { ProyectoUnoComponent } from './components/proyecto-uno/proyecto-uno.component';
import { ProyectoDosComponent } from './components/proyecto-dos/proyecto-dos.component';
import { InicioComponent } from './components/inicio/inicio.component';
import { ProyectoTresComponent } from './components/proyecto-tres/proyecto-tres.component';

// SERVICES
import { RickandmortyServiceService } from './services/rickandmorty-service.service';
import { CardRickandmortyComponent } from './components/card-rickandmorty/card-rickandmorty.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MainComponent,
    AsideComponent,
    ListadoSimsonsComponent,
    FormularioSimpsonsComponent,
    ProyectoUnoComponent,
    ProyectoDosComponent,
    InicioComponent,
    ProyectoTresComponent,
    CardRickandmortyComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [RickandmortyServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
