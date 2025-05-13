package com.rays.oop.constructor;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle(2);

		System.out.println(c.getRadius());
		System.out.println(c.area());

		System.out.println("--------");

		Rectangle r = new Rectangle(2, 2);

		System.out.println(r.getLenght());
		System.out.println(r.getWidth());
		System.out.println(r.area());
	}

}
