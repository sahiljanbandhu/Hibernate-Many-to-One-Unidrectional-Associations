package com.jsp.product.review.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.product.review.dto.Review;

public class ReviewDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sahil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Review createReview(Review review) {
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();

		System.out.println("Review Details Saved...");
		return review;
	}

	public Review geReviewById(int id) {
		Review r1 = entityManager.find(Review.class, id);

		return r1;
	}

	public Review deleteReviewById(int id) {
		Review r1 = entityManager.find(Review.class, id);

		entityTransaction.begin();
		entityManager.remove(r1);
		entityTransaction.commit();

		System.out.println("Review Details deleted....");
		return r1;
	}

	public Review updateReviewById(int id, int rating, String response) {

		Review r1 = entityManager.find(Review.class, id);

		if (r1 != null) {
			r1.setR_response(response);
			r1.setRating(rating);
			entityTransaction.begin();
			entityManager.merge(r1);
			entityTransaction.commit();
		} else {
			System.out.println("Review not found...");
		}
		return r1;
	}

}
