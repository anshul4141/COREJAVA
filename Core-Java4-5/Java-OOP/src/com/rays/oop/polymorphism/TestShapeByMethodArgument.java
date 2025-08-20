package com.rays.oop.polymorphism;

public class TestShapeByMethodArgument {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(2);

		Rectangle r = (Rectangle) s[1];
		r.setLenght(5);
		r.setWidht(10);

		Triangle t = (Triangle) s[2];
		t.setBase(5);
		t.setHight(10);

		double totalArea = ShapeMethodArgument.getArea(s);
		System.out.println("total area: " + totalArea);

	}

}
