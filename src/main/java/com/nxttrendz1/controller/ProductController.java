// Write your code here
package com.nxttrendz1.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.nxttrendz1.model.Product;
import com.nxttrendz1.service.ProductJpaService;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductJpaService productService;

    @GetMapping("/products")
    public ArrayList<Product> getProducts() {
        return productService.getProductList();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable("productId") int productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/products/{productId}")
    public Product updateProduct(@PathVariable("productId") int productId, @RequestBody Product product) {
        return productService.updateProduct(productId, product);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable("productId") int productId) {
        productService.deleteProduct(productId);
    }

}