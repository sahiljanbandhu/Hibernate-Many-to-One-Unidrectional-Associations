package com.jsp.product.review.controller;

import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;
import com.jsp.product.review.service.ProductService;
import com.jsp.product.review.service.ReviewService;

public class SaveController {
	public static void main(String[] args) {
		
		ReviewService reviewService = new ReviewService();
		ProductService productService = new ProductService();
		
		Product product = new Product();
		product.setP_name("Mobile");
		product.setP_price(10000);
		productService.createProduct(product);

		Review r1 = new Review();
		r1.setR_response("Good");
		r1.setRating(4);
		r1.setProduct(product);
		reviewService.createReview(r1);

		Review r2 = new Review();
		r2.setR_response("neutral");
		r2.setRating(4);
		r2.setProduct(product);
		reviewService.createReview(r2);
		
		Review r3 = new Review();
		r3.setR_response("bad");
		r3.setRating(1);
		r3.setProduct(product);
		reviewService.createReview(r3);

	
		
		
		
		
		
		
		
	}
}
