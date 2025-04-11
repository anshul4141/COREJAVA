package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestListMethods {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Ram");
		list.add(56);
		list.add(5.6);
		list.add(null);
		list.add(null);
		list.add("Ram");

		System.out.println("list: " + list);
		System.out.println("3rd value of list: " + list.get(2));
		list.remove(2);
		System.out.println("list: " + list);
		System.out.println(list.indexOf("Ram"));
		System.out.println(list.lastIndexOf("Ram"));
		System.out.println(list.subList(0, 4));
		
		

	}

}
