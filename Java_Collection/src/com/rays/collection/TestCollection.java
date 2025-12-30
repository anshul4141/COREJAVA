package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add("Ram");
		c.add(5);
		c.add(5.2);
		c.add('a');
		c.add(true);
		
		System.out.println(c);
		System.out.println("c contain a: " + c.contains('a'));
		System.out.println("size of c: " + c.size());
		System.out.println("remove a: " + c.remove('a'));
		System.out.println("size of c: " + c.size());
		System.out.println("c contain a: " + c.contains('a'));
		
		System.out.println("--------");
		
		for(Object o : c) {
			System.out.println(o);
		}
		
		c.add("Sita");
		System.out.println(c);

	}

}
