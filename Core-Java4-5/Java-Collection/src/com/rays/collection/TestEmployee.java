package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "ram", 1000));
		list.add(new Employee(2, "Shyam", 20000));

		System.out.println(list);

	}

}
