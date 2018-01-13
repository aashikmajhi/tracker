import {AfterViewInit, Component, OnInit, ViewChild} from '@angular/core';
import {AlertService} from '../userservice/AlertService';
import {ActivatedRoute} from '@angular/router';
import {MatSort, MatTableDataSource} from '@angular/material';

@Component({
  selector: 'app-alert',
  templateUrl: './alert.component.html',
  styleUrls: ['./alert.component.css']
})
export class AlertComponent implements OnInit,AfterViewInit {

  /*highAlert;
  itemsLength=0;
  constructor(alertService:AlertService ) {
    alertService.getHighAlertList()
      .subscribe(
        highAlert => this.highAlert=highAlert,
        error =>console.log(error)
      );

  }
  ngOnInit() {
  }*/
  highAlert;
  displayedColumns = ['vin','timeStamp','checkEngineLightOn','redLineRPM','fuelVolume','maxFuelVolume'];


  myDataSource = new MatTableDataSource(this.highAlert);
  ngAfterViewInit() {
    this.myDataSource.sort = this.sort;
  }
  @ViewChild(MatSort) sort: MatSort;
  ngOnInit() {
    this.alertService.getHighAlertList()
      .subscribe(
        highAlert => {this.highAlert=highAlert;this.myDataSource.data=highAlert;},
        error =>console.log(error)
      );
  }

  constructor(private alertService:AlertService ) {}

}
