package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Product;

public class ProductRepositoryImpl {

	public List<Product> findAll() {

		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(300, "Take some peace", "Goto Traval"));
		productList.add(new Product(300, "wants to do", "byby"));

		return productList;

	}
}
