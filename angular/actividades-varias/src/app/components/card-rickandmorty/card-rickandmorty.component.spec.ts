import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardRickandmortyComponent } from './card-rickandmorty.component';

describe('CardRickandmortyComponent', () => {
  let component: CardRickandmortyComponent;
  let fixture: ComponentFixture<CardRickandmortyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CardRickandmortyComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CardRickandmortyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
