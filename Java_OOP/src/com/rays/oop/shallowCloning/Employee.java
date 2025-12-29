package com.rays.oop.shallowCloning;

public class Employee implements Cloneable {

	public int id;
	public String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name;
	}

}
