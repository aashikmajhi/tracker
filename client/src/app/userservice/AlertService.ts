import {Injectable} from '@angular/core';
import {Http, RequestOptions , Headers } from '@angular/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';
import {baseBuildCommandOptions} from '@angular/cli/commands/build';
import {HttpClient} from '@angular/common/http';


@Injectable()
export class AlertService{
  constructor(private http: Http,private http1:HttpClient) { }


  getHighAlertList(): Observable<any[]>{
    return this.http.get('http://localhost:8080/alert')
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText) );
  }
  getAlertList(vehicleId): Observable<any[]>{

    return this.http.get(`http://localhost:8080/alert/${vehicleId}`)
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText) );
  }

  sendEmail(vinId){
    return this.http.get(`http://localhost:8080/sendEmail/${vinId}`)
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText) );
  }





}
