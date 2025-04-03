package com.rays.oop.polymorphism;

public class TestShapeByMethodReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(3);
		s[2] = Shape.getShape(2);

		Circle c = (Circle) s[0];
		c.setRadius(2);

		Rectangle r = (Rectangle) s[1];
		r.setLenght(2);
		r.setWidht(2);

		Triangle t = (Triangle) s[2];
		t.setBase(5);
		t.setHight(5);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		}

	}

}
