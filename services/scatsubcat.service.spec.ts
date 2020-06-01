import { TestBed } from '@angular/core/testing';

import { ScatsubcatService } from './scatsubcat.service';

describe('ScatsubcatService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ScatsubcatService = TestBed.get(ScatsubcatService);
    expect(service).toBeTruthy();
  });
});
