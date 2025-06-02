package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) {

		List<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet(105, "Ram", 45));
		list.add(new Marksheet(102, "Aman", 66));
		list.add(new Marksheet(101, "Pawan", 72));
		list.add(new Marksheet(103, "Jalaj", 91));
		list.add(new Marksheet(104, "Kamal", 33));

		list.forEach(System.out::println);
		
		Collections.sort(list);
		
		System.out.println("-----------");
		
		list.forEach(System.out::println);
		

	}

}
