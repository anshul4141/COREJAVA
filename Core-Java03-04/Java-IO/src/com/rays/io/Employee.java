package com.rays.io;

import java.io.Serializable;

public class Employee implements Serializable {

	public int id;
	public String name;

	public Employee() {

	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name;
	}

}
