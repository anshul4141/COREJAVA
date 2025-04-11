package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

//1. list can contain multiple null values
//2. list can contain multiple duplicate values
//3. order of list is natural order
public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Ram");
		list.add(56);
		list.add(5.6);
		list.add(null);
		list.add(null);
		list.add("Ram");

		System.out.println("list: " + list);
		System.out.println("size of list: " + list.size());

	}

}
