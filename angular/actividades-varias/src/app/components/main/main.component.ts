import { Component } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {
  arrValues: string[] = [];
  inputValue = ``;
  long: number = 0;
  inputSeleccionado: boolean[] = [];

  changeValue(value: number){
    console.log(value);
    this.inputSeleccionado[value] = true;
  }

  addArr(){
    console.log(this.arrValues);
    this.arrValues.push(this.inputValue);
    this.inputValue = ``;
    this.long = Math.ceil(this.arrValues.length / 12);

    this.inputSeleccionado.push(false);
  }
}
