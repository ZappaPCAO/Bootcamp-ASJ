import { Component, OnInit } from '@angular/core';
import { ToDolistService } from '../../services/to-dolist.service';
import { Tarea } from '../../models/tarea';

@Component({
  selector: 'app-proyecto-uno',
  templateUrl: './proyecto-uno.component.html',
  styleUrl: './proyecto-uno.component.css'
})
export class ProyectoUnoComponent implements OnInit {
  tareas: Tarea[] = [];
  inputValue = ``;
  long: number = 0;

  constructor(private toDoListService: ToDolistService){}

  deleteElem(value: Tarea){
    this.toDoListService.delete(value.id).subscribe( data => {
      if(data){
        const tareaIndex = this.tareas.findIndex((tarea: any) => tarea.id === value.id);

        if (tareaIndex !== -1) {
          // Utiliza slice para crear una nueva copia del array sin el elemento encontrado
          this.tareas = this.tareas.slice(0, tareaIndex).concat(this.tareas.slice(tareaIndex + 1));
        }        
      }
      this.long = Math.ceil(this.tareas.length / 12);
    })
  }

  addArr(){
    let tarea = {
      id: 0,
      nombre: this.inputValue,
      descripcion: "",
      estado: true
    }

    this.toDoListService.post(tarea).subscribe( data => {
      console.log(data);
      this.tareas.push(data);
      this.long = Math.ceil(this.tareas.length / 12);
    })

    this.inputValue = "";
  }

  updateElem(value: Tarea) {
    console.log("prueba: " + value.nombre)

    this.toDoListService.put(value).subscribe( data => {
      const tareaIndex = this.tareas.findIndex((tarea: any) => tarea.id === value.id);
      this.tareas[tareaIndex] = data;
    })

  }

  ngOnInit(): void {
    console.log("Prueba: ");
    this.toDoListService.get().subscribe( data =>{
      this.tareas = data;
      console.log(data); 
      this.long = Math.ceil(this.tareas.length / 12);
      });
  }
}