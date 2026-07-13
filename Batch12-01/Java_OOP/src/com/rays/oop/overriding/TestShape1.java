package com.rays.oop.overriding;

public class TestShape1 {

	public static void main(String[] args) {

		Shape s1 = new Circle();

		// type cast s1(parent obj) into c(child obj)
		Circle c = (Circle) s1;

		c.setColor("Blue");
		c.setBorderWidth(2);
		c.setRadius(5);

		c.area();

		System.out.println("------------");

		Shape s2 = new Rectangle();

		Rectangle r = (Rectangle) s2;

		r.setColor("red");
		r.setBorderWidth(2);
		r.setLenght(1);
		r.setWidth(3);

		r.area();

	}

}
