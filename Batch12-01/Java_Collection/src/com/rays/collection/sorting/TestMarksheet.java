package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) {

		Marksheet m1 = new Marksheet(105, "Ram", 62);
		Marksheet m2 = new Marksheet(101, "Aman", 85);
		Marksheet m3 = new Marksheet(109, "Rahul", 71);
		Marksheet m4 = new Marksheet(103, "Mohit", 90);
		Marksheet m5 = new Marksheet(107, "Sohan", 58);
		Marksheet m6 = new Marksheet(102, "Vijay", 77);
		Marksheet m7 = new Marksheet(110, "Rohit", 66);

		List<Marksheet> list = new ArrayList<Marksheet>();

		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);

		list.forEach(System.out::println);
		
		System.out.println("----------------");
		
		Collections.sort(list);
		
		list.forEach(System.out::println);

	}

}
