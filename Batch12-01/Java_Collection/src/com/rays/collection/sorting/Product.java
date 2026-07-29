package com.rays.collection.sorting;

public class Product {

	public String productName;
	public int productPrice;
	public String productCategory;

	public Product(String pn, int pp, String pc) {
		this.productName = pn;
		this.productPrice = pp;
		this.productCategory = pc;
	}

	@Override
	public String toString() {
		return "productName=" + productName + ", productPrice=" + productPrice + ", productCategory=" + productCategory;
	}

}
