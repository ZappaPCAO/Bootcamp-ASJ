import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Tarea } from '../models/tarea';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ToDolistService {
  constructor(private http: HttpClient) {
    console.log('Servicio funcionando');
  }

  public get() : Observable<Tarea[]> {
    return this.http.get('http://localhost:8080/tareas').pipe(
      map(response => response as Tarea[])
    )
  }

  public getById(id: number) {     
  }

  post(tarea: Tarea) : Observable<Tarea> {        
    return this.http.post('http://localhost:8080/tareas', tarea).pipe(
      map(response => response as Tarea)
    )    
  }

  put(tarea: Tarea){
    return this.http.put('http://localhost:8080/tareas/'+tarea.id, tarea).pipe(
      map(response => response as Tarea)
    )    
  }

  delete(id: number) : Observable<boolean> {
    return this.http.delete('http://localhost:8080/tareas/'+id).pipe(
      map(response => response as boolean)
    )    
  }
}
