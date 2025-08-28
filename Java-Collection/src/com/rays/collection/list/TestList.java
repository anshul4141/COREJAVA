package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

//1.List can contain duplicate values
//2.List can contain multiple null values
//3.Order of list is natural order
public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Ram");
		list.add('a');
		list.add(56);
		list.add("Ram");
		list.add("Ram");
		list.add(null);
		list.add(null);

		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list);
		list.set(0, "Sita");
		System.out.println(list);
		System.out.println(list.indexOf("Ram"));
		System.out.println(list.lastIndexOf("Ram"));
		System.out.println(list.subList(0, 4));

	}

}
