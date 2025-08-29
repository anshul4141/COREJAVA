package com.rays.collection.sorting;

public class Employee implements Comparable<Employee> {

	public int id;
	public String name;
	public int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {

		return "id: " + id + " name: " + name + " salary: " + salary;

	}

	@Override
	public int compareTo(Employee o) {
		// current argument asc
		// argument current desc
		// return o.salary - this.salary; 
		// return o.id - this.id;
		return o.name.compareTo(this.name);
	}

}
