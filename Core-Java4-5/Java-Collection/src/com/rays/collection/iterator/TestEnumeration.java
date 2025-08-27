package com.rays.collection.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("Ram");
		v.add('a');
		v.add(56);
		v.add("Ram");
		v.add("Ram");
		v.add(null);
		v.add(null);

		System.out.println(v);

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}

	}

}
