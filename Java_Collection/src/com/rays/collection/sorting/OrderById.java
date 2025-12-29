package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id - o2.id; // sort by id in asc order
		// return o2.id - o1.id; // sort by id in desc order
	}

}
