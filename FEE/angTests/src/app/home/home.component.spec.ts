import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeComponent } from './home.component';
import { By } from '@angular/platform-browser';

describe('HomeComponent', () => {
  let component: HomeComponent;
  let fixture: ComponentFixture<HomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('test the *ngform',()=>{
    var hname:string[] = [];
    fixture = TestBed.createComponent(HomeComponent);
    fixture.detectChanges();
    
    const usersDebugElems = fixture.debugElement.queryAll(By.css("p.has-text-centered"));
    
    for(var i=0;i<usersDebugElems.length;i++){
      console.log("===>" + usersDebugElems[i].nativeElement.textContent);
      hname.push(usersDebugElems[i].nativeElement.textContent)
    }
    console.log("hname..." + hname);
    const userResponse = ['Abcd','XYZ','1234','asdf'];

    expect(hname).toEqual(userResponse);

  });
});
