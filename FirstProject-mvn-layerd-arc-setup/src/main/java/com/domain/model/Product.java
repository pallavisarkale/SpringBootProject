package com.domain.model;

public class Product {

	private float price;
	private String productName;
	private String productId;

	public Product(String productId, String productName, float price) {
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
