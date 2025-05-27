package com.rays.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(5);
		v.add("KGF");
		v.add(2.3);

		System.out.println(v);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}

	}

}
