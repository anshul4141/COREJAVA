package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("aman");
		list.add(5);
		list.add(5.3);

		// fail fast
		Iterator it = list.iterator();

		list.add("Ram");

		while (it.hasNext()) {

			Object o = it.next();

			System.out.println(o);

		}

	}

}
