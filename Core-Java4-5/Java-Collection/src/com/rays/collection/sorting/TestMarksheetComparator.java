package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheetComparator {

	public static void main(String[] args) {

		List<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet(103, "Ram", 45));
		list.add(new Marksheet(101, "Shyam", 55));
		list.add(new Marksheet(105, "Kanal", 63));
		list.add(new Marksheet(104, "Aman", 32));
		list.add(new Marksheet(102, "Ram", 98));
		list.add(new Marksheet(107, "Pawan", 98));
		list.add(new Marksheet(106, "Ram", 98));

		list.forEach(System.out::println);

		OrderByName byName = new OrderByName();
		System.out.println("---sort by name---");
		Collections.sort(list, byName);
		list.forEach(System.out::println);

		OrderByRollNo byRollNo = new OrderByRollNo();
		System.out.println("---sort by rollNo---");
		Collections.sort(list, byRollNo);
		list.forEach(System.out::println);

	}

}
