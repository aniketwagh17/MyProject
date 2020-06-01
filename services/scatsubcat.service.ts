import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Catsubcat } from '../models/icatsubcat';

@Injectable({
  providedIn: 'root'
})

export class ScatsubcatService {

url="http://localhost:8080/emartFinalService/crud/catsubcat/";
catsubcatarray:Catsubcat[];
catsubcatobj:Catsubcat;



  constructor(private http: HttpClient) { }

  getCatsubcat(cname:string): Observable<any[]>{
    return this.http.get<any[]>(this.url+cname);
  }
}

