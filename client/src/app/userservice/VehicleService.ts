import {Injectable} from '@angular/core';
import {Http, RequestOptions , Headers } from '@angular/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';
import {baseBuildCommandOptions} from '@angular/cli/commands/build';

@Injectable()
export class VehicleService{
  constructor(private http: Http) { }

  getVehicleList(): Observable<any[]>{
    return this.http.get('http://localhost:8080/vehicles')
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText) );
  }

  getVehicleById(vehicleId): Observable<any>{
    return this.http.get(`http://localhost:8080/vehicles/${vehicleId}`)
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText) );
  }

  getReadingById(vehicleId): Observable<any>{
    return this.http.get(`http://localhost:8080/readings/${vehicleId}`)
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText) );
  }




}
