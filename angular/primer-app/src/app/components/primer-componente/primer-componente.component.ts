import { JsonPipe } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'primer-componente',
  templateUrl: './primer-componente.component.html',
  styleUrl: './primer-componente.component.css'
})
export class PrimerComponenteComponent {
  text = `primer componente secundario creado`;

  num = Math.floor(Math.random() * 10);

  generarAleatorio(){
    this.num = Math.floor(Math.random() * 10);
  }
  alterarNum(event: any){
    this.num = event.target.id == 'suma' ? this.num+1 : this.num-1;
  }
}


