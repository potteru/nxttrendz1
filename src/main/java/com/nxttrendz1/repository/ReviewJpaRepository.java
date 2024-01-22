package com.nxttrendz1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxttrendz1.model.Review;

public interface ReviewJpaRepository extends JpaRepository<Review, Integer>{
	
}
