import { Component } from '@angular/core';

@Component({
  selector: 'app-proyecto-dos',
  templateUrl: './proyecto-dos.component.html',
  styleUrl: './proyecto-dos.component.css'
})
export class ProyectoDosComponent {
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
