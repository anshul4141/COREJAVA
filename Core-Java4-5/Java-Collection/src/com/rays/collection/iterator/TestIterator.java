package com.rays.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

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

		System.out.println("---iterator---");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.print(o + ", ");
		}

		System.out.println();

		System.out.println("---for each loop---");
		for (Object o : list) {
			System.out.print(o + ", ");
		}

		System.out.println();
		System.out.println("---for each method---");
//		list.forEach(e -> {
//			System.out.print(e + ", ");
//		});
//		list.forEach(System.out::println);
		list.forEach(e -> System.out.print(e + ", "));

	}

}
