package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

//List can be duplicate
//List always in natural order
//List can contain multiple null element/value
public class TestArrayList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(0, "Mango");
		list.add(1, "Orange");
		list.add(2, "Apple");
		list.add(3, "Banana");
//		list.add(5, "Watermelon"); // IndexOutOfBoundExcpetion
		list.add("Mango");
		list.add("Watermelon");
		list.add(4, "Chiku");

		System.out.println(list.get(4));
		System.out.println(list.get(5));

//		list.remove(5);
		// System.out.println(list.get(5));
		System.out.println(list.get(1));
		list.set(1, "Guava");
		System.out.println(list.get(1));
		System.out.println(list.indexOf("Mango"));
		System.out.println(list.lastIndexOf("Mango"));

	}

}
