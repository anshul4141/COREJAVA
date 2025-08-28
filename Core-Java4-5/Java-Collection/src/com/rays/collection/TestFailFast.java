package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Ram");
		list.add('a');
		list.add(56);
		list.add("Ram");
		list.add("Ram");
		list.add(null);
		list.add(null);

		Iterator it = list.iterator();

		// fail fast
		list.add("Ram");

		while (it.hasNext()) {
			Object o = it.next();
			it.remove();
			System.out.println(o);
		}

		System.out.println(list);

	}

}
