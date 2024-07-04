import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VcudComponent } from './vcud.component';

describe('VcudComponent', () => {
  let component: VcudComponent;
  let fixture: ComponentFixture<VcudComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [VcudComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VcudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
