import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RickandmortyServiceService } from '../../services/rickandmorty-service.service';

@Component({
  selector: 'app-card-rickandmorty',
  templateUrl: './card-rickandmorty.component.html',
  styleUrl: './card-rickandmorty.component.css'
})
export class CardRickandmortyComponent implements OnInit {
  pj: any;

  constructor(private route: ActivatedRoute, public rickAndMorty: RickandmortyServiceService){}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      const id = +params['id'];
      this.rickAndMorty.getPersonajeAPI( id ).subscribe( data => this.pj = data );
    } )
    console.log(this.pj);
  }
}
