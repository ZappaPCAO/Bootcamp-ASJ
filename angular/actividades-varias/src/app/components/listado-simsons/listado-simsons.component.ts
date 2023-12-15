import { Component, Input } from '@angular/core';

@Component({
  selector: 'listado-simsons',
  templateUrl: './listado-simsons.component.html',
  styleUrl: './listado-simsons.component.css'
})
export class ListadoSimsonsComponent {
  @Input() personajes: Personaje[] = [];

  mostrar() {
    console.log(this.personajes);
  }
}
type Personaje = {
  nombre:string;
  profesion:string;
  foto:string;
}