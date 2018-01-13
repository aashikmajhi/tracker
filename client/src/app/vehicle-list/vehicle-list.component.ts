import { Component, OnInit } from '@angular/core';

import {VehicleService} from '../userservice/VehicleService';

@Component({
  selector: 'app-vehicle-list',
  templateUrl: './vehicle-list.component.html',
  styleUrls: ['./vehicle-list.component.css']
})
export class VehicleListComponent implements OnInit {

  vehicles;
  constructor(vehicleService:VehicleService ){
    vehicleService.getVehicleList()
      .subscribe(
        vehicles => this.vehicles=vehicles,
        error =>console.log(error)
      );
  }
 /* vehicles;
  constructor(public vehicleService:VehicleService ) {
    this.vehicles=vehicleService.getVehicleList();
  }*/

  ngOnInit() {
  }

}
