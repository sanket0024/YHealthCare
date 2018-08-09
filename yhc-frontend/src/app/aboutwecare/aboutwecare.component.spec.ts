import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutwecareComponent } from './aboutwecare.component';

describe('AboutwecareComponent', () => {
  let component: AboutwecareComponent;
  let fixture: ComponentFixture<AboutwecareComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AboutwecareComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AboutwecareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
