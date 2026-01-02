package com.rays.collection.sorting;

public class Employee {

	protected int id;
	protected String name;
	protected int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name + " salary: " + salary + "\n";
	}

}
