package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

// 1. List can contain duplicate elements
// 2. List can contain multiple null values
// 3. Order of list is natural order
public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

//		ArrayList list1 = new ArrayList();

		list.add(0, "Ram");
		list.add(1, 'a');
		list.add(2, 2.3);
		// list.add(6, "Sita"); index out of bound
		list.add(3, true);
		list.add(4, 45);
		list.add(5, "Ram");
		list.add(6, "Ram");
		list.add(6, "Sita");

//		list.add("Ram");
//		list.add('a');
//		list.add(2.3);
//		list.add(true);
//		list.add(45);
//		list.add("Ram");
//		list.add("Ram");

		System.out.println("list: " + list);
		System.out.println(list.get(7));

		System.out.println(list.remove(6));
		System.out.println("list: " + list);

		System.out.println(list.set(0, "Rawan"));
		System.out.println(list);

		System.out.println(list.indexOf("Ram"));
		System.out.println(list.lastIndexOf("Ram"));
		System.out.println(list.subList(1, 7));

	}

}
