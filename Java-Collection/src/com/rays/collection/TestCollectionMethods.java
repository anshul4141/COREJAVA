package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethods {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add(6);
		c1.add(6.2);
		c1.add("KALKI");
		c1.add('a');
		c1.add(true);

		System.out.println("c1: " + c1);
//		System.out.println(c1.contains("KALKI"));
//		c1.remove(6.2);
//		System.out.println("c1: " + c1);

		Collection c2 = new ArrayList();

		c2.add(5);
		c2.add(5.2);
		c2.add("WAR");
		c2.add('b');
		c2.add(false);

		System.out.println("c2: " + c2);

		System.out.println("c1 me c2 hai ?: " + c1.containsAll(c2));
		System.out.println("size of c1: " + c1.size());
		c1.addAll(c2);
		System.out.println("size of c1: " + c1.size());
		System.out.println("c1 me c2 hai ?: " + c1.containsAll(c2));
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		c1.removeAll(c2);
		System.out.println("c1 me c2 hai ?: " + c1.containsAll(c2));
		System.out.println(!c1.isEmpty());

	}

}
