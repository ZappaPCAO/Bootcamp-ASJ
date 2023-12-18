import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-hijo',
  templateUrl: './hijo.component.html',
  styleUrls: ['./hijo.component.css']
})
export class HijoComponent {
  @Input() datoEnviado!: any;
  @Input() otro!: string;

  @Output() mensaje!: EventEmitter<string>;

  constructor(){
    this.mensaje = new EventEmitter();
  }
  enviarMensaje(){
    this.mensaje.emit(`Comunicacion hijo-padre`);
  }
}
