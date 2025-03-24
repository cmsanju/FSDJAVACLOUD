import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DataApiService } from '../data-api.service';
import { Product } from '../product';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
//import 'rxjs/add/operator/map';
//import * as DataTables from 'datatables.net';
@Component({
  selector: 'app-list-data',
  imports: [
    FormsModule,
    ReactiveFormsModule,
    CommonModule,
    RouterModule
  ],
  templateUrl: './list-data.component.html',
  styleUrl: './list-data.component.css'
})
export class ListDataComponent implements OnInit
{
  products: Product[];
  product:Product = new Product();

  constructor(private productService:DataApiService)
  {

  }
  deleteMessage=false;
  productlist:any;
  isupdated = false; 

  ngOnInit(): void {
    this.productService.findAll().subscribe(data => {
      this.products=data;
    });
  }
/*
  deleteProduct(id: number) {
    this.productService.deleteStudent(id)
      .subscribe(
        data => {
          console.log(data);
          this.deleteMessage=true;
          this.productService.findAll().subscribe(data =>{
            this.products =data
            })
        },
        error => console.log(error));
  }

  updateProduct(id: number){
    this.productService.getStudent(id)
      .subscribe(
        data => {
          this.productlist=data           
        },
        error => console.log(error));
  }

  productupdateform=new FormGroup({
    id:new FormControl(),
    name:new FormControl(),
    price:new FormControl(),
    
  });

  updateStu(){
    this.product=new Product(); 
   this.product.id = this.ProductId?.value;
   this.product.name = this.ProductName?.value;
   this.product.price = this.ProductPrice?.value;
   
   console.log(this.ProductName?.value);
   

   this.productService.updateStudent(this.product.id,this.product).subscribe(
    data => {     
      this.isupdated=true;
      this.productService.findAll().subscribe(data =>{
        this.products =data
        })
    },
    error => console.log(error));
  }


  get ProductName(){
    return this.productupdateform.get('name');
  }

  get ProductPrice(){
    return this.productupdateform.get('price');
  }

  get ProductId(){
    return this.productupdateform.get('id');
  }

  changeisUpdate(){
    this.isupdated=false;
  }
  */
}
