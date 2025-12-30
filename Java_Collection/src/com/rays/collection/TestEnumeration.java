package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

// Enumeration use only in historical classes
public class TestEnumeration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("Orange");
		v.add("Mango");
		v.add("Banana");
		v.add("Grapes");
		v.add("Papaya");

		Enumeration e = v.elements();

		v.add("Apple"); // not fail-fast/fail-safe

		while (e.hasMoreElements()) { // hasMoreElements check the next element
			Object o = e.nextElement(); // nextElement iterate the next element
			System.out.println(o); // print the element
		}

	}

}
