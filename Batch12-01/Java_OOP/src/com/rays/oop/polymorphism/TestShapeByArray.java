package com.rays.oop.polymorphism;

public class TestShapeByArray {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1);
		s[1] = new Rectangle();

		Circle c = (Circle) s[0];

		c.setRadius(2);

		Rectangle r = (Rectangle) s[1];

		r.setLenght(5);
		r.setWidth(2);

		for (int i = 0; i < 2; i++) {
			s[i].area();
		}

	}

}
