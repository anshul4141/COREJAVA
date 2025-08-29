package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(6, "Ram", 45000));
		list.add(new Employee(3, "Shyam", 36000));
		list.add(new Employee(5, "Kamal", 36000));
		list.add(new Employee(1, "Uday", 78000));
		list.add(new Employee(4, "Ankit", 4000));
		list.add(new Employee(2, "Kunal", 90000));

		list.forEach(System.out::println);
		
		System.out.println("-----------");
	
		Collections.sort(list);
		list.forEach(System.out::println);

	}

}
