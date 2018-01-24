import { Component, OnInit } from '@angular/core';
import {VehicleService} from '../userservice/VehicleService';
import {ActivatedRoute} from '@angular/router';
import {AlertService} from '../userservice/AlertService';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-alert-detail',
  templateUrl: './alert-detail.component.html',
  styleUrls: ['./alert-detail.component.css']
})
export class AlertDetailComponent implements OnInit {


  alert;
  constructor(private http: HttpClient,private route: ActivatedRoute,private alertService:AlertService ){
}

  ngOnInit(): void
  {

    this.route.params.subscribe(params => {
      this.alertService.getAlertList(params['vin'])
        .subscribe(
          alert => this.alert=alert,
          error =>console.log(error)
        );
    });
  }

  sendEmail(vin){

    this.route.params.subscribe(params => {
      this.alertService.sendEmail(params['vin'])
        .subscribe(
          alert => this.alert=alert,
          error =>console.log(error)
        );
    });

  }


}
