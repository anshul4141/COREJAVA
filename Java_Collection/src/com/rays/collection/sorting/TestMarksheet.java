package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {

	public static void main(String[] args) {

		Marksheet m1 = new Marksheet("Ram", 101, 45);
		Marksheet m2 = new Marksheet("Shyam", 102, 78);
		Marksheet m3 = new Marksheet("Kamal", 106, 88);
		Marksheet m4 = new Marksheet("Aman", 103, 69);
		Marksheet m5 = new Marksheet("Pawan", 104, 35);
		Marksheet m6 = new Marksheet("Rakesh", 105, 55);

		ArrayList<Marksheet> list = new ArrayList<Marksheet>();

		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);

		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
