package com.rays.collection.list;

import java.util.List;
import java.util.Vector;

public class TestVector {
	
	public static void main(String[] args) {
		
		List v = new Vector();
		
		v.add(0, "Ram");
		v.add(1, "Ram");
		v.add(2, "Shyam");
		v.add(3, null);
		v.add(4, null);
		v.add(5, 5.2);
		v.add(6, 'a');
		v.add(7, true);
		
		System.out.println(v);

		System.out.println(v.get(6));

		
	}

}
