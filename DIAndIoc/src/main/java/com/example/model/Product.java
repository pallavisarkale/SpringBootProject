package com.example.model;

public class Product {

	private float price;
	private String productName;
	private String productId;

	public Product(float price, String productName, String productId) {
		super();
		this.price = price;
		this.productName = productName;
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", productName=" + productName + ", productId=" + productId + "]";
	}

}
