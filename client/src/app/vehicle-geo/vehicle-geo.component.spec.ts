import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicleGeoComponent } from './vehicle-geo.component';

describe('VehicleGeoComponent', () => {
  let component: VehicleGeoComponent;
  let fixture: ComponentFixture<VehicleGeoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VehicleGeoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VehicleGeoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
