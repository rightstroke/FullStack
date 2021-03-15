import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FundstranferComponent } from './fundstranfer.component';

describe('FundstranferComponent', () => {
  let component: FundstranferComponent;
  let fixture: ComponentFixture<FundstranferComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FundstranferComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FundstranferComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
