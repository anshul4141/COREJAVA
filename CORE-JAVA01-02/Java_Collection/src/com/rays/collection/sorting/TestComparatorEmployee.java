package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparatorEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(5, "Ram", 1000);
		Employee e2 = new Employee(3, "Shyam", 45000);
		Employee e3 = new Employee(1, "Ghanshyam", 52000);
		Employee e4 = new Employee(2, "Saket", 45333);
		Employee e5 = new Employee(4, "Shruti", 2000);

		ArrayList list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		list.forEach(System.out::println);

		System.out.println("---sort by name---");

		OrderByName byName = new OrderByName();
		Collections.sort(list, byName);
		list.forEach(System.out::println);

		System.out.println("---sort by id---");

		OrderById byId = new OrderById();
		Collections.sort(list, byId);
		list.forEach(System.out::println);

		System.out.println("---sort by salary---");

		OrderBySalary bySalary = new OrderBySalary();
		Collections.sort(list, bySalary);
		list.forEach(System.out::println);

	}

}
