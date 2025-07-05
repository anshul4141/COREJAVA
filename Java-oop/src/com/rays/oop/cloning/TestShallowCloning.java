package com.rays.oop.cloning;

public class TestShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p1 = new Person();

		p1.id = 1;
		p1.name = "Ram";

		System.out.println(p1.id);
		System.out.println(p1.name);
		
		System.out.println("--------");

		Person p2 = (Person) p1.clone();

		p2.id = 2;
		p2.name = "Shyam";

		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p2.id);
		System.out.println(p2.name);

	}

}
