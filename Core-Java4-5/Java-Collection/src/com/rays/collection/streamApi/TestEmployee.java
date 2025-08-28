package com.rays.collection.streamApi;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(4000, "Amit"));
		list.add(new Employee(4000, "Amit"));
		list.add(new Employee(1000, "Chetan"));
		list.add(new Employee(5000, "Akbar"));
		list.add(new Employee(45000, "Sanjana"));

		System.out.println("employee:----------");
		list.forEach(System.out::println);

		System.out.println("remove duplicate from employee:----------");
		list.stream().distinct().forEach(System.out::println);

	}

}
