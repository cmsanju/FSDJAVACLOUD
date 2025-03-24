import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class DataApiService {

  private baseUrl: string;

  constructor(private http: HttpClient) {
    this.baseUrl = 'http://localhost:5577/products/v1/';
  }

  public findAll(): Observable<Product[]> {
    return this.http.get<Product[]>(this.baseUrl+'listall');
  }

  public save(prod: Product) {
    return this.http.post<Product>(this.baseUrl+'create', prod);
  }

  deleteProduct(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}delete/${id}`, { responseType: 'json' });
  }
  getProduct(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}byid/${id}`);
  }

  updateProduct(id: number, value: any): Observable<Object> {
    return this.http.post(`${this.baseUrl}update/${id}`, value);
  }

}
