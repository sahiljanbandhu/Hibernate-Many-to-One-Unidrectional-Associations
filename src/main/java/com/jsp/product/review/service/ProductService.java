package com.jsp.product.review.service;

import com.jsp.product.review.dao.ProductDao;
import com.jsp.product.review.dto.Product;

public class ProductService {

	ProductDao productDao = new ProductDao();

	public Product createProduct(Product product) {
		return productDao.createProduct(product);
	}

	public Product geProductById(int id) {
		return productDao.geProductById(id);
	}

	public Product deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}

	public Product updateProductById(int id, String name, int price) {

		return productDao.updateProductById(id, name, price);
	}
}
