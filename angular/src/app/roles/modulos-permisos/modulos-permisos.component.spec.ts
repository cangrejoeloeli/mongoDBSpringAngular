import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModulosPermisosComponent } from './modulos-permisos.component';

describe('ModulosPermisosComponent', () => {
  let component: ModulosPermisosComponent;
  let fixture: ComponentFixture<ModulosPermisosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ModulosPermisosComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ModulosPermisosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
