package com.ruturaj.simpleWebApp.Controller;

import com.ruturaj.simpleWebApp.Model.Product;
import com.ruturaj.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    // Add New Product
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        System.out.println("Added: " + prod);
        service.addProduct(prod);
    }

    // Update Product
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        System.out.println("Updated: " + prod);
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void DeleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
    }
}
