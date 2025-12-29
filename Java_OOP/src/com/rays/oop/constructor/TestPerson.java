package com.rays.oop.constructor;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Ram", "Indore");
		
		System.out.println("p1 name: " + p1.getName());
		System.out.println("p1 address: " + p1.getAddress());
		
		Person p2 = new Person("Shyam", "Bhopal");
		
	}

}
