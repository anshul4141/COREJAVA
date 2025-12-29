package com.rays.oop.polymorphism;

public class TestPolymorphismByArrays {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		System.out.println("lenght of shape array: " + s.length);

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(4);

		Rectangle r = (Rectangle) s[1];
		r.setLenght(4);
		r.setWidht(8);

		Triangle t = (Triangle) s[2];
		t.setBase(4);
		t.setHight(4);

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}

	}

}
