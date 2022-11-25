package com.Product1.Product_Catalog1.repository;

import com.Product1.Product_Catalog1.modle.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>
{

}
