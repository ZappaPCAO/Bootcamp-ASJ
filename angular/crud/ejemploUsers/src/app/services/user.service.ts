import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  constructor(private http: HttpClient) { }

  urlAPI = 'https://reqres.in/api/users';
  datoUsuario: any = {
    id: -1,
    name: '',
    job: ''
  }

  // GET Usuarios
  public getUsers():Observable<any>{
    return this.http.get(this.urlAPI);
  }

  // POST Usuario
  public postUsers(usuarios:any): Observable<any>{
    console.log(`llamando al api`);
    return this.http.post(this.urlAPI, usuarios);
  }

  // DELETE Usuario
  public deleteUser(id:any): Observable<any>{
    return this.http.delete(`${this.urlAPI}/${id}`);
  }

  // PUT Usuario
  public updateUsuario(usuario: any): Observable<any>{
    return this.http.put(`${this.urlAPI}/${this.datoUsuario.ud}`, usuario);
  }
}
