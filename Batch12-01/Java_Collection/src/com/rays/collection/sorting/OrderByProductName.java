package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderByProductName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.productName.compareTo(o2.productName); // asc
	}

}
