import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'formulario-simpsons',
  templateUrl: './formulario-simpsons.component.html',
  styleUrl: './formulario-simpsons.component.css',
})
export class FormularioSimpsonsComponent {
  inputPersonaje!:string; inputProfesion!:string; inputFoto!:string;
  personajes: Personaje[] = [];
  @Output() personajesEnviar: EventEmitter<Personaje[]>;
  
  constructor(){
    this.personajesEnviar = new EventEmitter<Personaje[]>();
  }

  enviarPersonaje(){
    this.personajesEnviar.emit(this.personajes);
  }

  agregarPersonaje(){
    const personaje: Personaje = {
      nombre: this.inputPersonaje,
      profesion: this.inputProfesion,
      foto: this.inputFoto};
      
    this.personajes.push(personaje);
    this.enviarPersonaje();
  }
}

type Personaje = {
  nombre:string,
  profesion:string,
  foto:string,
}