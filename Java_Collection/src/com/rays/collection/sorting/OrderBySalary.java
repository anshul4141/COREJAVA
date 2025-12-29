package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.salary - o2.salary; // order by salary in asc order
		// return o2.salary - o1.salary; // order by salary in desc order
	}

}
