package com.nxttrendz1.repository;

import java.util.ArrayList;

import com.nxttrendz1.model.Product;

public interface ProductRepository {
    ArrayList<Product> getProducts();
    Product getProductById(int productId);
    Product addProduct(Product product);
    Product updateProduct(int productId, Product product);
    void deleteProduct(int productId);
}
