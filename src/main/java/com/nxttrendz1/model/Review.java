package com.nxttrendz1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="REVIEW")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="REVIEWID")
	int reviewId;
	
	@Column(name="REVIEWCONTENT")
	String reviewContent;
	
	@Column(name="RATING")
	int rating;
	
	@Column(name="PRODUCT")
	Product product;
	
	public Review(int reviewId, String reviewContent, int rating, Product product) {
		super();
		this.reviewId = reviewId;
		this.reviewContent = reviewContent;
		this.rating = rating;
		this.product = product;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
