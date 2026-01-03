package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name); // sort by name in asc order
		// return o2.name.compareTo(o1.name); // sort by name in desc order
	}

}
