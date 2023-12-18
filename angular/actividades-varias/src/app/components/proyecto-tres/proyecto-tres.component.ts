import { Component, OnInit } from '@angular/core';
import { RickandmortyServiceService } from '../../services/rickandmorty-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'proyecto-tres',
  templateUrl: './proyecto-tres.component.html',
  styleUrl: './proyecto-tres.component.css'
})
export class ProyectoTresComponent implements OnInit {
  arrPj: any = [];
  pjEdit: any;

  constructor( public servRickMorty: RickandmortyServiceService, private router: Router ){}

  ngOnInit(): void {
    this.servRickMorty.getDataAPI().subscribe( data =>{ this.arrPj = data; console.log(data); });
  }

  editPj(id:number){
    this.router.navigate(['proyecto-tres/pj', id]);
  }
}
