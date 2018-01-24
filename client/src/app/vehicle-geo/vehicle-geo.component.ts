import { Component, OnInit } from '@angular/core';
import {VehicleService} from '../userservice/VehicleService';
import {AlertService} from '../userservice/AlertService';
import {ActivatedRoute} from '@angular/router';


@Component({
  selector: 'app-vehicle-geo',
  templateUrl: './vehicle-geo.component.html',
  styleUrls: ['./vehicle-geo.component.css']
})
export class VehicleGeoComponent implements OnInit {

  lat1;
  lng1;
  readings;

  ngOnInit(): void {

    this.route.params.subscribe(params => {
      this.vehicleService.getReadingById(params['vin'])
        .subscribe(
          readings => {this.readings=readings ;
          this.lat1=readings[0].latitude;
          this.lng1=readings[0].longitude;
          } ,
          error =>console.log(error)
        );
    });

  }

  constructor(private route: ActivatedRoute,
              private vehicleService:VehicleService ){
  }

}
