import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoDeImagenesComponent } from './listado-de-imagenes.component';

describe('ListadoDeImagenesComponent', () => {
  let component: ListadoDeImagenesComponent;
  let fixture: ComponentFixture<ListadoDeImagenesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListadoDeImagenesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListadoDeImagenesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
