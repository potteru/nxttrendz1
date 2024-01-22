package com.nxttrendz1.repository;

import java.util.ArrayList;

import com.nxttrendz1.model.Product;

public interface ProductRepository{
	
	ArrayList<Product> getProductList();

	Product addProduct(Product Product);

	Product getProductById(int productId);

	Product updateProduct(int productId, Product product);

	void deleteProduct(int productId);
	
}
