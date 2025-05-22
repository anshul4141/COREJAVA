package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add("KGF");
		c1.add('b');
		c1.add(23);
		c1.add(2.3);
		c1.add(true);

		System.out.println("c1: " + c1);
		System.out.println("size of c1: " + c1.size());

		System.out.println("----------");

		Collection c2 = new ArrayList();

		c2.add("KGF");
		c2.add('b');
		c2.add(32);
		c2.add(3.2);
		c2.add(false);

		System.out.println("c2: " + c2);
		System.out.println("size of c2: " + c2.size());

		c1.retainAll(c2);
		System.out.println("c1: " + c1);

	}

}
