package com.rays.collection;

public class Student {

	public int id;
	public String name;
	public int salary;

	public Student() {

	}

	public Student(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Student)) {
			return false;
		}

		Student s = (Student) obj;

		return this.id == s.id && this.name == s.name && this.salary == salary;

	}

	@Override
	public int hashCode() {

		String value = id + name + salary;

		return value.hashCode();
	}

}
