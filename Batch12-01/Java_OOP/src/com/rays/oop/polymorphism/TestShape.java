package com.rays.oop.polymorphism;

public class TestShape {

	public static void main(String[] args) {

		Shape s1 = new Circle();

		Circle c = (Circle) s1;

		c.setRadius(2);

		c.area();

		System.out.println("-------------------");

		Shape s2 = new Rectangle();

		Rectangle r = (Rectangle) s2;

		r.setLenght(2);
		r.setWidth(6);

		r.area();

	}

}
