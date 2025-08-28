package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {

		List<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet(104, "Ram", 85));
		list.add(new Marksheet(102, "Aman", 63));
		list.add(new Marksheet(101, "Uday", 72));
		list.add(new Marksheet(103, "Pawan", 45));
		
		Collections.sort(list);

		list.forEach(System.out::println);

	}

}
