package com.rays.collection.equalsAndHashcode;

public class Student {

	public String name;
	public String address;

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
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
		return this.name == s.name && this.address == s.address;

	}

	@Override
	public int hashCode() {

		String s = name + address;

		return s.hashCode();
	}

}
