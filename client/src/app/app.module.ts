import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import {RouterModule, Routes} from '@angular/router';
import { VehicleListComponent } from './vehicle-list/vehicle-list.component';
import {VehicleService} from './userservice/VehicleService';
import { VehicleDetailComponent } from './vehicle-detail/vehicle-detail.component';
import { AlertDetailComponent } from './alert-detail/alert-detail.component';
import {AlertService} from './userservice/AlertService';
import { AlertComponent } from './alert/alert.component';
import { VehicleGeoComponent } from './vehicle-geo/vehicle-geo.component';

import { AgmCoreModule } from '@agm/core';
import {MatSortModule, MatTableModule} from '@angular/material';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';




const appRoutes: Routes = [

  { path: 'vehicles/:id', component: VehicleDetailComponent },
  { path: 'vehicles', component: VehicleListComponent },
  { path: 'alert', component: AlertComponent },
  { path: 'alert/:vin', component: AlertDetailComponent },
  { path: 'geo/:vin', component: VehicleGeoComponent },
  { path: '', redirectTo: '/vehicles', pathMatch: 'full' }
];


@NgModule({
  declarations: [
    AppComponent,
    VehicleListComponent,
    VehicleDetailComponent,
    AlertDetailComponent,
    AlertComponent,
    VehicleGeoComponent

  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyBq8NcSm_tJFxJuxxehYKIChMHPLr9STYY'
    }),
    MatTableModule,MatSortModule,
    BrowserAnimationsModule
  ],
  providers: [VehicleService,AlertService],
  bootstrap: [AppComponent]
})
export class AppModule { }
