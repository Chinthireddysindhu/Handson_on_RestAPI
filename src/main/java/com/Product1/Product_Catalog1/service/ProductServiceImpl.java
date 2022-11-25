package com.Product1.Product_Catalog1.service;

import javax.transaction.Transactional;
import com.Product1.Product_Catalog1.modle.Product;
import com.Product1.Product_Catalog1.exception.ProductException;
import com.Product1.Product_Catalog1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product P)
    {
        return productRepository.save(P);
    }

    @Override
    public Product updateProduct(Product p1) {
        Optional<Product> prodObj = this.productRepository.findById(p1.getProductid());
        if(prodObj.isPresent()){
            Product prodUpdate = prodObj.get();
            prodUpdate.setProductid(p1.getProductid());
            prodUpdate.setProductCount(p1.getProductCount());
            prodUpdate.setProductName(p1.getProductName());
            prodUpdate.setProductQuantity(p1.getProductQuantity());
            return this.productRepository.save(prodUpdate);
        }
        else{
            throw new ProductException("Product id not found" + p1.getProductid());
        }
    }

    @Override
    public List<Product> getProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(long productid) {
        Optional<Product> prodObj = this.productRepository.findById(productid);
        if(prodObj.isPresent()){
            return prodObj.get();
        }
        else{
            throw new ProductException("productid not found"+ productid);
        }
    }

    @Override
    public void deleteProduct(long productid) {
        Optional<Product> prodObj = this.productRepository.findById(productid);
        if(prodObj.isPresent()){
            this.productRepository.deleteById(productid);
        }
        else{
            throw new ProductException("productid not found"+ productid);
        }
    }
}



