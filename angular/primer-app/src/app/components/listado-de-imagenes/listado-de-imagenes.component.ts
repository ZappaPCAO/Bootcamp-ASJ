import { Component } from '@angular/core';

@Component({
  selector: 'listado-de-imagenes',
  templateUrl: './listado-de-imagenes.component.html',
  styleUrl: './listado-de-imagenes.component.css'
})
export class ListadoDeImagenesComponent {
  imagenes = ['img1', 'img2', 'img3'];
}
