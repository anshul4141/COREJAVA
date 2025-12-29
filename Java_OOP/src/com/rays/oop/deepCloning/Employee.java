package com.rays.oop.deepCloning;

public class Employee implements Cloneable {

	public int id;
	public String name;
	public Address address;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		this.address = new Address("Indore");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Employee e = (Employee) super.clone();

		e.address = (Address) address.clone();

		return e;
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name + " address: " + address;
	}

}
