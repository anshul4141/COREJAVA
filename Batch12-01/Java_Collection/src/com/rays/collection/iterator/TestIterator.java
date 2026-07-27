package com.rays.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		list.add("Watermelon");
		list.add("Chiku");

		System.out.println("list: " + list);
		System.out.println("--------------");

		Iterator it = list.iterator();

//		list.add("Mango"); // Throw ConcurrentModificationException ---> Fail-Fast

		while (it.hasNext()) {
//			it.remove(); // Throw IllegalStateException
			Object o = it.next();
			System.out.println(o);
			if (o.equals("Orange")) {
				it.remove();
			}
		}

		System.out.println("---------------");

		System.out.println("list: " + list);

	}

}
