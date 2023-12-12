import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  compras=['fruta', 'carne', 'verdura', 'mango'];
  band = true;
  title = 'COSITAS';
}
