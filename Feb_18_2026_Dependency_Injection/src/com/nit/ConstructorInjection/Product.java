package com.nit.ConstructorInjection;

public class Product {
	int productId;
	String productName;
	int productQty;

	public Product(int productId, String productName, int productQty) {
		this.productId = productId;
		this.productName = productName;
		this.productQty = productQty;
	}

	@Override
	public String toString() {
		return "ProductId=" + productId + "\nProductName=" + productName + "\nProductQty=" + productQty;
	}

}
