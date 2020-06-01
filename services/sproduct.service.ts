import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../models/iproduct';

@Injectable({
  providedIn: 'root'
})

export class SproductService {

url="b";
Productarray:Product[];
Productobj:Product;

constructor(private http: HttpClient) { }

/*getProduct(pname:string): Observable<any[]>{
    alert(this.url+cname);
    return this.http.get<any[]>(this.url+pname);
  }*/

 }

