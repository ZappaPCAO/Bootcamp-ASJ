import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrl: './user-form.component.css'
})
export class UserFormComponent implements OnInit {
  usuarios: any = [];
  mensaje: string = '';

  constructor(public userService: UserService, private router: Router){}

  ngOnInit(): void {
    this.list();
  }

  list(){
    this.userService.getUsers().subscribe(res => {
      console.log(res)
      this.usuarios = res;
    });
  }

  resetear(form: NgForm) {
    form.reset();
    this.userService.datoUsuario = {
      id: -1
    };
    setTimeout(()=>{ 
      this.mensaje = '';
    }, 2000)
  }

  create(form: any) {
    console.log(form);
    if(form.value.id !== -1){
      this.userService.updateUsuario(form.value).subscribe(res => {
        this.resetear(form);
        this.list();
        this.mensaje = 'Editado correctamente!';
        console.log(this.mensaje);
      })
    }else if(!form.valid){
        return;
    }else{
      this.userService.postUsers(form.value).subscribe(res => {
        this.resetear(form);
        this.list();
        this.mensaje = 'Creado correctamente!';
        console.log(this.mensaje);
      });      
    } 
  }
}
