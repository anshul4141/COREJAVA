package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestProduct {

	public static void main(String[] args) {

		Product p1 = new Product("PS5", 59000, "Electronic");
		Product p2 = new Product("iPhone 16", 85000, "Mobile");
		Product p3 = new Product("Nike Shoes", 4500, "Footwear");
		Product p4 = new Product("Laptop", 72000, "Electronic");
		Product p5 = new Product("Office Chair", 6500, "Furniture");
		Product p6 = new Product("Smart Watch", 12000, "Wearable");
		Product p7 = new Product("Refrigerator", 38000, "Appliance");

		List<Product> list = new ArrayList<Product>();

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);

		OrderByProductName byName = new OrderByProductName();
		OrderByProductPrice byPrice = new OrderByProductPrice();

		Collections.sort(list, byName);

		list.forEach(System.out::println);
		
		System.out.println("--------------");
		
		Collections.sort(list, byPrice);

		list.forEach(System.out::println);

	}

}
