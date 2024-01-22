package com.nxttrendz1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxttrendz1.model.Product;

public interface ProductJpaRepository extends JpaRepository<Product,Integer> {
	
	

}
