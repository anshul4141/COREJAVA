package com.rays.io.serializable;

import java.io.Serializable;

public class Employee implements Serializable {

	public String name;
	public transient int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {

		return "name: " + name + " id: " + id;
	}

}
