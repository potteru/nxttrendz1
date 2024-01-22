package com.nxttrendz1.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.nxttrendz1.model.Product;
import com.nxttrendz1.repository.ProductRepository;

@Service
public class ProductJpaService implements ProductRepository{

	@Override
	public ArrayList<Product> getProductList() {
		
		return null;
	}

	@Override
	public Product addProduct(Product Product) {
		
		return null;
	}

	@Override
	public Product getProductById(int productId) {
		
		return null;
	}

	@Override
	public Product updateProduct(int productId, Product product) {
		
		return null;
	}

	@Override
	public void deleteProduct(int productId) {
		
		
	}
	
	
	
}
