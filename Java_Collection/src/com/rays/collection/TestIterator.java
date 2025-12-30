package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Iterator use in most all collection
public class TestIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Orange");
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");
		list.add("Papaya");

		System.out.println(list);

		System.out.println("------------");

		Iterator it = list.iterator(); // create Iterator object

		// list.add("Apple"); // fail-fast ---> ConcurrentModificationException

		while (it.hasNext()) { // hasNext check the next element
			Object o = it.next(); // next iterate the next element
			System.out.println(o); // print the next element
			it.remove(); // remove the elements
		}

		System.out.println("------------");
		System.out.println(list);

	}

}
