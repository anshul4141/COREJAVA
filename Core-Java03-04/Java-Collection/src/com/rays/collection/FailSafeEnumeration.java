package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafeEnumeration {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(5);
		v.add('a');
		v.add("Ram");
		
		Enumeration e = v.elements();
		
		v.add(3.3);
		
		while(e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
		
	}

}
