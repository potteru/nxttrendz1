package com.nxttrendz1.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.nxttrendz1.model.Review;
import com.nxttrendz1.repository.ReviewRepository;

@Service
public class ReviewJpaService implements ReviewRepository{

	@Override
	public ArrayList<Review> getReviews() {
		
		return null;
	}

	@Override
	public Review addReview(Review review) {
		
		return null;
	}

	@Override
	public Review getReviewById(int reviewId) {
		
		return null;
	}

	@Override
	public Review updateReview(int reviewId, Review review) {
		
		return null;
	}

	@Override
	public void deleteReview(int reviewId) {
		
		
	}
	
}
