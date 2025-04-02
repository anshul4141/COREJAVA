package com.rays.oop.polymorphism;

public class TestShapeByArrays {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Triangle();
		s[2] = new Rectangle();

		Circle c = (Circle) s[0];
		c.setRadius(2);

		Triangle t = (Triangle) s[1];
		t.setBase(5);
		t.setHight(5);

		Rectangle r = (Rectangle) s[2];
		r.setLenght(2);
		r.setWidht(2);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		}

	}

}
