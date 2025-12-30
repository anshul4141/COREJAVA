package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

//1. list contain duplicate elements
//2. list contain multiple null values
//3. order of list is natural order
public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(0, "Ram");
		list.add(1, "Ram");
		list.add(2, "Shyam");
		list.add(3, null);
		list.add(4, null);
		list.add(5, 5.2);
		list.add(6, 'a');
		list.add(7, true);

		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.get(7));
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println("----------");
		System.out.println(list.get(1));
		System.out.println(list.indexOf("Ram"));
		System.out.println(list.lastIndexOf("Ram"));
		System.out.println("--------");
		list.set(1, "Rawan");
		System.out.println(list.get(1));
		
		System.out.println(list.subList(1, 8));

	}

}
