import { TestBed } from '@angular/core/testing';

import { ToDolistService } from './to-dolist.service';

describe('ToDolistService', () => {
  let service: ToDolistService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ToDolistService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
