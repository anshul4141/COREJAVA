package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(0, "Ram");
		list.add(1, 'a');
		list.add(2, 2.3);
		list.add(3, true);
		list.add(4, 45);
		list.add(5, "Ram");
		list.add(6, "Ram");

		System.out.println("list: " + list);

		System.out.println("----Iterator----");

		Iterator it = list.iterator();

		list.add("Sita"); // Fail Fast

		while (it.hasNext()) {
			// it.remove(); // java.lang.IllegalStateException
			Object o = it.next();
			System.out.println("elements: " + o);
			it.remove(); // remove from collection
		}

		System.out.println("list: " + list);
		
		list.add("Sita");
		System.out.println("list: " + list);

	}
}
