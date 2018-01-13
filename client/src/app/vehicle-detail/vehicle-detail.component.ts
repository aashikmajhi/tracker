import { Component, OnInit } from '@angular/core';
import {VehicleService} from '../userservice/VehicleService';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-vehicle-detail',
  templateUrl: './vehicle-detail.component.html',
  styleUrls: ['./vehicle-detail.component.css']
})
export class VehicleDetailComponent implements OnInit {

  vehicle;
  constructor(private route: ActivatedRoute,vehicleService:VehicleService ){

    this.route.params.subscribe(params => {
    vehicleService.getVehicleById(params['vin'])
      .subscribe(
        vehicle => this.vehicle=vehicle,
        error =>console.log(error)
      );
  });}


  ngOnInit() {
  }

}
