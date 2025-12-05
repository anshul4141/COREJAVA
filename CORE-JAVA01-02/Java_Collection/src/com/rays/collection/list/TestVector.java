package com.rays.collection.list;

import java.util.Vector;

// vector increase double of its size
// thread safe
// slow performance
public class TestVector {

	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.addElement("Ram");
		v.addElement(45);
		
		System.out.println(v.elementAt(1));
		System.out.println(v.get(1));

	}

}
