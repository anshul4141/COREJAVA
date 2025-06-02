package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

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

		System.out.println("----for each loop----");

		for (Object o : list) {
			System.out.println(o);
		}

		System.out.println("-----Iterator-----");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

		System.out.println("----for each method----");

		// list.forEach(System.out::println);
		list.forEach(e -> System.out.println(e));

	}

}
