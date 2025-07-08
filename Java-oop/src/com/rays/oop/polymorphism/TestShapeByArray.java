package com.rays.oop.polymorphism;

public class TestShapeByArray {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Triangle();
		s[2] = new Rectangle();

		Circle c = (Circle) s[0];
		c.setRadius(6);

		Triangle t = (Triangle) s[1];
		t.setBase(4);
		t.setHight(8);

		Rectangle r = (Rectangle) s[2];
		r.setLenght(2);
		r.setWidth(2);

		for (int i = 0; i < s.length; i++) {
			System.out.println("area: " + s[i].area());
		}

		System.out.println("-----------------");

		for (Shape j : s) {
			System.out.println(j.area());
		}

	}

}
