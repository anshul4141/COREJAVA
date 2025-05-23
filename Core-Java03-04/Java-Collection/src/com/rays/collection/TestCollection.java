package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add("KGF");
		c.add('a');
		c.add(23);
		c.add(2.3);
		c.add(true);
		c.add("KGF");
		c.add(null);
		c.add(null);

		System.out.println("c: " + c);
		System.out.println("size of c: " + c.size());

		System.out.println("---------------");

		for (Object o : c) {
			System.out.println(o);
		}

	}

}
