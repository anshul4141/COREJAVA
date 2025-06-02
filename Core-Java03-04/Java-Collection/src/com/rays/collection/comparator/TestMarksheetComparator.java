package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheetComparator {

	public static void main(String[] args) {

		List<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet(105, "Ram", 45));
		list.add(new Marksheet(102, "Aman", 66));
		list.add(new Marksheet(101, "Pawan", 72));
		list.add(new Marksheet(103, "Jalaj", 91));
		list.add(new Marksheet(104, "Kamal", 33));

		System.out.println("---Compare by phy---");
		OrderByPhy byPhy = new OrderByPhy();
		Collections.sort(list, byPhy);
		list.forEach(System.out::println);

		System.out.println("---Compare by name---");
		OrderByName byName = new OrderByName();
		Collections.sort(list, byName);
		list.forEach(System.out::println);
	}

}
