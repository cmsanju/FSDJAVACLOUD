import { Component } from '@angular/core';
import { Product } from '../product';
import { DataApiService } from '../data-api.service';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-add-data',
  imports: [
    CommonModule,
    FormsModule,
   RouterModule
    
  ],
  templateUrl: './add-data.component.html',
  styleUrl: './add-data.component.css'
})
export class AddDataComponent {
  product: Product;

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private productService: DataApiService) {
    this.product = new Product();
  }

  onSubmit() {
    this.productService.save(this.product).subscribe(result => this.gotoProductList());
  }

  gotoProductList() {
    this.router.navigate(['/view-product']);
  }
}
