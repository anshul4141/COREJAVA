package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add("KGF");
		c.add(56);
		c.add(5.6);
		c.add(true);
		c.add('a');
		c.add("KGF");

		System.out.println("collection: " + c);
		System.out.println("size of collection: " + c.size());
		System.out.println("----for each loop----");
		for (Object o : c) {
			System.out.println(o);
		}

	}

}
