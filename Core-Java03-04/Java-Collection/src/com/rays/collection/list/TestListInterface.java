package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

//1. List contain multiple null values
//2. List can be duplicate
//3. Order of List is natural order
public class TestListInterface {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("KGF");
		list.add(23);
		list.add(2.3);
		list.add(null);
		list.add(null);
		list.add("KGF");
		list.add("KGF");

		System.out.println("list: " + list);
		System.out.println("6th element in list is: " + list.get(5));
		System.out.println("size of list: " + list.size());
		list.remove(1);
		System.out.println("list: " + list);
		System.out.println("first index of KGF is: " + list.indexOf("KGF"));
		System.out.println("last index of KGF is: " + list.lastIndexOf("KGF"));
		System.out.println(list.subList(0, 5));
		System.out.println("-------------");
		for (Object o : list) {
			System.out.println(o);
		}

	}

}
