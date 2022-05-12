package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class ProductRepositoryimpl {
	public List<Product> findAll() {

		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("po1", "ABC", 108));
		productList.add(new Product("po2", "Pqr", 300));

		return productList;
	}

}
