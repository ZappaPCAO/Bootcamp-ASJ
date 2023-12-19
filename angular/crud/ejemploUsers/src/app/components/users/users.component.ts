import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrl: './users.component.css'
})
export class UsersComponent implements OnInit {
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

  update(usuario: any) {
    this.userService.datoUsuario = {
      name: usuario.first_name,
      job: `Astronauta`,
    };
    this.router.navigate(['user' ,usuario.id]);
  }

  delete(id: any) {
    let confirmacion = confirm(`¿Desea elminar a #${id}?`);

    if(confirmacion){
      this.userService.deleteUser(id).subscribe(res => console.log("Respuesta del DELETE", res));
      this.list();
    }
  }

  
}
