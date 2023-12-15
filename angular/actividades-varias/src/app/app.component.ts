import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',

})
export class AppComponent {
  personajes: Personaje[] = [];

  manejarPersonajes(personajes: Personaje[]) {
    this.personajes = personajes; 
    
   
  }
  mostrar(){
    console.log(this.personajes);
  }
}
type Personaje = {
  nombre:string;
  profesion:string;
  foto:string;
}
