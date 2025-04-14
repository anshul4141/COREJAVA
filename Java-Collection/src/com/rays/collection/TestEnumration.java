package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("Ram");
		v.addElement(5);
		v.add(5.3);

		System.out.println(v);

		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			
			Object o = e.nextElement();
			System.out.println(o);
			
		}

	}

}
