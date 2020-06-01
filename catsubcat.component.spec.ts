import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CatsubcatComponent } from './catsubcat.component';

describe('CatsubcatComponent', () => {
  let component: CatsubcatComponent;
  let fixture: ComponentFixture<CatsubcatComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CatsubcatComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CatsubcatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
