package com.rays.collection.list;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("Ram");
		v.addElement(5);
		v.add(5.3);

		System.out.println(v);
		System.out.println(v.size());

	}

}
