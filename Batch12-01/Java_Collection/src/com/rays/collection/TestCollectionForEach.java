package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Collection;

public class TestCollectionForEach {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayDeque();
		
		c.add(45);
		c.add("Orange");
		c.add(7.3);
		c.add('a');
		c.add(true);

		System.out.println("size of c is: " + c.size());
		System.out.println("-----");
		System.out.println(c);
		
		System.out.println("------------");
		
		for(Object o : c) {
			System.out.println(o);
		}
	}

}
