package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethods {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add("KGF");
		c1.add('a');
		c1.add(23);
		c1.add(2.3);
		c1.add(true);

		System.out.println("c1: " + c1);
		System.out.println("size of c1: " + c1.size());

		System.out.println("----------");

		Collection c2 = new ArrayList();

		c2.add("Kalki");
		c2.add('b');
		c2.add(32);
		c2.add(3.2);
		c2.add(false);

		System.out.println("c2: " + c2);
		System.out.println("size of c2: " + c2.size());

		System.out.println("----------");

		c1.addAll(c2);
		System.out.println("c1 ke pass c2 hai ? " + c1.containsAll(c2));
		System.out.println("c1 after add c2 collection: " + c1);
		System.out.println("new size of c1 is: " + c1.size());
		c1.remove("KGF");
		System.out.println("----------");
		System.out.println("c1 ofter remove KGF: " + c1);
		c1.removeAll(c2);
		System.out.println("----------");
		System.out.println("c1 after remove c2: " + c1);
		System.out.println("c1 ke pass c2 hai ? " + c1.containsAll(c2));
		System.out.println("c1 ke pass KGF hai ? " + c1.contains(true));
		System.out.println("kya c1 khali hai ? " + c1.isEmpty());
		c1.clear();
		System.out.println("kya c1 khali hai ? " + c1.isEmpty());

	}

}
