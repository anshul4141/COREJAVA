package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(45);
		c.add("Orange");
		c.add(7.3);
		c.add('a');
		c.add(true);

		System.out.println("size of c is: " + c.size());
		System.out.println("-----");
		System.out.println(c);
		System.out.println("Mango is available: " + c.contains("Mango"));
		System.out.println("Orange is available: " + c.contains("Orange"));
		c.remove("Orange");
		System.out.println("----------");
		System.out.println("Orange is available: " + c.contains("Orange"));
		System.out.println("new size of c: " + c.size());
		c.clear();
		System.out.println("new size of c: " + c.size());
		

	}

}
