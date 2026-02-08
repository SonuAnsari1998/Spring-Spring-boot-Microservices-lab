package com.nit.beans;

public class Product {
	String productName;
	double price;
	String category;

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String showDetails() {
		return "Product Name : "+this.productName+
				"\nProduct Price: "+this.price+
				"\nCategory: "+this.category;
	}
}
