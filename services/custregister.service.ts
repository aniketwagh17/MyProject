import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Customer } from '../models/icustomer';

@Injectable({
  providedIn: 'root'
})

export class CustregisterService
{
  custobj:Customer;
  url="http://localhost:8080/CustPostService/crud/add";



  constructor(private http : HttpClient) { }

  postcustomer(custobj):Observable<any>
  {
    console.log(custobj);
    return this.http.post<any>(this.url,custobj);
  }
}