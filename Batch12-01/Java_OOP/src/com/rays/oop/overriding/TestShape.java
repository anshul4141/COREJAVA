package com.rays.oop.overriding;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();

		c.setColor("red");
		c.setBorderWidth(4);
		c.setRadius(2);

		c.area();

		System.out.println("-------------------");

		Rectangle r = new Rectangle();

		r.setColor("blue");
		r.setBorderWidth(2);
		r.setLenght(5);
		r.setWidth(3);

		r.area();
	}

}
