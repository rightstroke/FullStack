import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IntrBankComponent } from './intr-bank.component';

describe('IntrBankComponent', () => {
  let component: IntrBankComponent;
  let fixture: ComponentFixture<IntrBankComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IntrBankComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IntrBankComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
