package com.Product1.Product_Catalog1.service;

import com.Product1.Product_Catalog1.modle.Product;

import java.util.List;

public interface ProductService
{
    Product createProduct(Product p);
    Product updateProduct(Product p);
     List<Product> getProducts();
    Product getProductById(long pId);
    void deleteProduct(long pId);

}
