package com.rays.collection.streamApi;

public class Employee {

	Integer salary;
	String name;

	public Employee(Integer salary, String name) {

		this.salary = salary;
		this.name = name;

	}

	public Integer getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "name: " + name + " salary: " + salary;
	}

}
