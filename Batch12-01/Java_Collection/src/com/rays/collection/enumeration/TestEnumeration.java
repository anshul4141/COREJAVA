package com.rays.collection.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("Mango");
		v.add("Orange");
		v.add("Apple");
		v.add("Banana");
		v.add("Watermelon");
		v.add("Chiku");

		System.out.println("v: " + v);

		System.out.println("-----------");

		Enumeration e = v.elements();

		v.add("Mango"); // No Excepton here ------> Fail-Safe

		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}

		System.out.println("--------");

		System.out.println("v: " + v);
	}

}
