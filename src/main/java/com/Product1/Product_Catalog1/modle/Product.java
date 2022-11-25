package com.Product1.Product_Catalog1.modle;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="products")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productid;

    @Column(name="productName")
    private String productName;

    @Column(name="productCount")
    private int productCount;

    @Column(name="productQuantity")
    private int productQuantity;

    //@CreationTimestamp
   // private Date createTime;

    public long getProductid() {
        return productid;
    }

    public void setProductid(long productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

   // public Date getCreateTime() {
   //     return createTime;
   // }

   // public void setCreateTime(Date createTime) {
    ////    this.createTime = createTime;
   // }
}
