package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(0, "Ram");
		v.add(1, 'a');
		v.add(2, 2.3);
		v.add(3, true);
		v.add(4, 45);
		v.add(5, "Ram");
		v.add(6, "Ram");

		System.out.println("vector: " + v);

		System.out.println("----Enumeration----");

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
		
		System.out.println("vector: " + v);

	}

}
