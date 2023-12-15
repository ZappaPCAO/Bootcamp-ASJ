import { Component } from '@angular/core';

@Component({
  selector: 'app-proyecto-uno',
  templateUrl: './proyecto-uno.component.html',
  styleUrl: './proyecto-uno.component.css'
})
export class ProyectoUnoComponent {
  tareas: Tarea[] = [];
  inputValue = ``;
  long: number = 0;

  deleteElem(value: Tarea){
    const index =  this.tareas.findIndex((tarea) => tarea.id === value.id);
    this.tareas.splice(index, 1);
  }
  
  changeValue(value: Tarea){
    const index =  this.tareas.findIndex((tarea) => tarea.id === value.id);
    this.tareas[index].cond = !(this.tareas[index].cond);
  }

  addArr(){
    console.log(this.tareas);
    this.tareas.push(new Tarea(this.inputValue, (this.tareas.length > 0) ? this.tareas[this.tareas.length - 1].id : 0));
    this.inputValue = ``;
    this.long = Math.ceil(this.tareas.length / 12);
  }
}

class Tarea {
  constructor(value:string, id:number){
    this.value = value;
    this.cond = false;
    this.id = id + 1;
  }

  id: number;
  value: string;
  cond: boolean;
}