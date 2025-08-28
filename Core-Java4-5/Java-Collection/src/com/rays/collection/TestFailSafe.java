package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("Ram");
		v.add('a');
		v.add(56);
		v.add("Ram");
		v.add("Ram");
		v.add(null);
		v.add(null);

		Enumeration e = v.elements();

		// Fail safe
		v.add("Shyam");

		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}

	}

}
