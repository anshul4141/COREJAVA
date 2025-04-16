package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheetComparator {

	public static void main(String[] args) {

		List<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet(105, "Ram", 85));
		list.add(new Marksheet(103, "Aman", 46));
		list.add(new Marksheet(101, "Pawan", 72));
		list.add(new Marksheet(104, "Uday", 55));
		list.add(new Marksheet(102, "Shyam", 33));

		System.out.println("---list in natural order---");
		list.forEach(System.out::println);

		OrderByName byName = new OrderByName();
		Collections.sort(list, byName);
		System.out.println("---list order by name---");

		list.forEach(System.out::println);

		OrderByRollNo byRollNo = new OrderByRollNo();
		Collections.sort(list, byRollNo);
		System.out.println("---list order by rollNo---");

		list.forEach(System.out::println);
		
		

	}

}
