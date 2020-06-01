import { TestBed } from '@angular/core/testing';

import { SproductService } from './sproduct.service';

describe('SproductService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SproductService = TestBed.get(SproductService);
    expect(service).toBeTruthy();
  });
});
