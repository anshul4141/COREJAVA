package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparator {

	public static void main(String[] args) {

		Employee e1 = new Employee(5, "Uday", 78000);
		Employee e2 = new Employee(1, "Aman", 5000);
		Employee e3 = new Employee(6, "Raman", 45000);
		Employee e4 = new Employee(3, "Kamlesh", 80000);
		Employee e5 = new Employee(2, "Suraj", 6000);
		Employee e6 = new Employee(4, "Naman", 65000);

		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		System.out.println(list);

		OrderById byId = new OrderById();
		System.out.println("------------");
		Collections.sort(list, byId);
		System.out.println(list);

		OrderByName byName = new OrderByName();
		System.out.println("------------");
		Collections.sort(list, byName);
		System.out.println(list);

		OrderBySalary bySalary = new OrderBySalary();
		System.out.println("------------");
		Collections.sort(list, bySalary);
		System.out.println(list);

	}

}
