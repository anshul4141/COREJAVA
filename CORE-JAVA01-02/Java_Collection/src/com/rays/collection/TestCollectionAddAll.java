package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionAddAll {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add(45);
		c1.add("Ram");
		c1.add('a');
		c1.add(4.2);
		c1.add(true);

		System.out.println("c1: " + c1);
		System.out.println("size of c1: " + c1.size());
		
		System.out.println("------------");
		
		Collection c2 = new ArrayList();
		
		c2.add(78);
		c2.add("Rawan");
		c2.add('b');
		
		System.out.println("c2: " + c2);
		System.out.println("size of c2: " + c2.size());
		
		System.out.println("--------------");
		
		c1.addAll(c2);
		System.out.println("c1 after adding c2: " + c1);
		
		System.out.println(c1.removeAll(c2));
		System.out.println("c1 after remove c2: " + c1);
		System.out.println(c1.removeAll(c2));
		
		

	}

}
