package com.Product1.Product_Catalog1.Controller;

import com.Product1.Product_Catalog1.modle.Product;
import com.Product1.Product_Catalog1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class Controller
{
    @Autowired
    private ProductService productService;
    @GetMapping("/product")
    private ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok().body(this.productService.getProducts());
    }
    @GetMapping("/product/{productID}")
    private Product getProductById(@PathVariable long productID){
        return this.productService.getProductById(productID);

    }
    @PostMapping("/product")
    private ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(this.productService.createProduct(product));
    }

    @PutMapping("/product/{productID}")
    private ResponseEntity<Product> updateProduct(@PathVariable long productID,@RequestBody Product product){
        product.setProductid(productID);
        return ResponseEntity.ok().body(this.productService.updateProduct(product));
    }
    @DeleteMapping("/product/{productID}")
    private HttpStatus deleteProduct(@PathVariable long productID){
        this.productService.deleteProduct(productID);
        return HttpStatus.OK;
    }


}
