package com.ruturaj.simpleWebApp.Service;

// FIX IMPORT BASED ON YOUR PACKAGE NAME
import com.ruturaj.simpleWebApp.Model.Product;   // OR use .model.Product;

import com.ruturaj.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    // --------------------------
    // H2 DATABASE CONFIGURATION
    // --------------------------

    @Autowired
    ProductRepo repo;


    // --------------------------
    // LOCAL LIST (WITHOUT DB)
    // --------------------------

    // List<Product> products = new ArrayList<>(Arrays.asList(
    //        new Product(101,"IPhone",50000),
    //        new Product(102,"Samsung",40000),
    //        new Product(103,"Shure Mic", 10000))
    // );


    // --------------------------
    // GET ALL PRODUCTS
    // --------------------------

    public List<Product> getProducts() {
        return repo.findAll();
    }

    // public List<Product> getProducts() {
    //     return products;
    // }


    // --------------------------
    // GET PRODUCT BY ID
    // --------------------------

    public Product getProductById(int prodId) {
        return repo.findById(prodId)
                .orElse(new Product());
    }


    // public Product getProductById(int prodId) {
    //     return products.stream()
    //             .filter(p -> p.getProdId() == prodId)
    //             .findFirst()
    //             .orElse(new Product(100,"No Item",0));
    // }


    // --------------------------
    // ADD PRODUCT
    // --------------------------

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    // public void addProduct(Product prod) {
    //     products.add(prod);
    // }


    // --------------------------
    // UPDATE PRODUCT
    // --------------------------

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    // public void updateProduct(@RequestBody Product prod) {
    //     int index=0;
    //     for(int i=0;i<products.size();i++)
    //         if(products.get(i).getProdId() == prod.getProdId())
    //             index=i;
    //     products.set(index,prod);
    // }


    // --------------------------
    // DELETE PRODUCT
    // --------------------------

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

    // public void deleteProduct(int prodId) {
    //     int index=0;
    //     for(int i=0;i<products.size();i++)
    //         if(products.get(i).getProdId() == prodId)
    //             index=i;
    //     products.remove(index);
    // }
}
