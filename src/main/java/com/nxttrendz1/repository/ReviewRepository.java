package com.nxttrendz1.repository;

import java.util.ArrayList;

import com.nxttrendz1.model.Product;
import com.nxttrendz1.model.Review;

public interface ReviewRepository {
    ArrayList<Review> getReviews();

    Review getReviewById(int reviewId);

    Review addReview(Review review);

    Review updateReview(int reviewId, Review review);

    void deleteReview(int reviewId);

    Product getReviewProduct(int reviewId);
}
