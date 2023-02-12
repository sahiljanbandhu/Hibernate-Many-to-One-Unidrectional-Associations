package com.jsp.product.review.service;

import com.jsp.product.review.dao.ReviewDao;
import com.jsp.product.review.dto.Review;

public class ReviewService {
	ReviewDao reviewDao = new ReviewDao();

	public Review createReview(Review review) {
		return reviewDao.createReview(review);
	}

	public Review geReviewById(int id) {
		return reviewDao.geReviewById(id);
	}

	public Review deleteReviewById(int id) {
		return reviewDao.deleteReviewById(id);
	}

	public Review updateReviewById(int id, int rating, String response) {

		return reviewDao.updateReviewById(id, rating, response);
	}

}
