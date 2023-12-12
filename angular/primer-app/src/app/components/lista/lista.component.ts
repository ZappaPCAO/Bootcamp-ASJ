import { Component } from '@angular/core';

@Component({
  selector: 'lista',
  templateUrl: './lista.component.html',
  styleUrl: './lista.component.css'
})
export class ListaComponent {
  listado = [1,2,3,]; // Listado inicial
  subtitulo = "Listado de numeros";
  band = true;

  agregarNum(){
    this.listado.push(Math.floor(Math.random()*21));
  }

  ocultarListado(event: any){
    if(this.band){
      this.band = false;
      event.target.innerHTML = "Mostrar listado"
    }else{
      this.band = true;
      event.target.innerHTML = "Ocultar listado"
    }
    
  }
}
