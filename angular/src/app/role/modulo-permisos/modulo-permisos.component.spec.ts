import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModuloPermisosComponent } from './modulo-permisos.component';

describe('ModuloPermisosComponent', () => {
  let component: ModuloPermisosComponent;
  let fixture: ComponentFixture<ModuloPermisosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ModuloPermisosComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ModuloPermisosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
