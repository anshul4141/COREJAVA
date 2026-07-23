package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestAllCollectionMethods {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add(45);
		c1.add("Orange");
		c1.add(7.3);
		c1.add('a');
		c1.add(true);

		System.out.println("size of c1 is: " + c1.size());
		System.out.println(c1);

		System.out.println("-------------------");

		Collection c2 = new ArrayList();

		c2.add(6);
		c2.add("Mango");
		c2.add(3.6);
		c2.add('b');

		System.out.println("size of c2 is: " + c2.size());
		System.out.println(c2);
		
		System.out.println("-----------");
		System.out.println(c1.containsAll(c2));
		c1.addAll(c2);
		System.out.println(c1.containsAll(c2));
		System.out.println("new size of c1 is: " + c1.size());
		System.out.println(c1);
		c1.removeAll(c2);
		System.out.println("new size of c1 is: " + c1.size());
		System.out.println(c1);
		

	}

}
