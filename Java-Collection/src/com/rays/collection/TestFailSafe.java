package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("Ram");
		v.addElement(5);
		v.add(5.3);

		// Fail safe / not fail fast
		Enumeration e = v.elements();

		v.addElement("Aman");

		while (e.hasMoreElements()) {

			Object o = e.nextElement();

			System.out.println(o);

		}

	}

}
