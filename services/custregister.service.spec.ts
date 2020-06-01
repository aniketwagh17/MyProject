import { TestBed } from '@angular/core/testing';

import { CustregisterService } from './custregister.service';

describe('CustregisterService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CustregisterService = TestBed.get(CustregisterService);
    expect(service).toBeTruthy();
  });
});
