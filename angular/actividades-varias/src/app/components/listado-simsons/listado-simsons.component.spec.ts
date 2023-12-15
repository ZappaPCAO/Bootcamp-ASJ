import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoSimsonsComponent } from './listado-simsons.component';

describe('ListadoSimsonsComponent', () => {
  let component: ListadoSimsonsComponent;
  let fixture: ComponentFixture<ListadoSimsonsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListadoSimsonsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListadoSimsonsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
