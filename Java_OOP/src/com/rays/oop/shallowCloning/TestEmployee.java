package com.rays.oop.shallowCloning;

public class TestEmployee {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e1 = new Employee(1, "Ram");

		Employee e2 = (Employee) e1.clone();

		e2.id = 2;
		e2.name = "Shyam";

		System.out.println(e1);
		System.out.println(e2);

	}

}
