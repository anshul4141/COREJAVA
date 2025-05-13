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
		r.setLenght(2);
		r.setWidth(2);

		Triangle t = (Triangle) s[2];
		t.setBase(2);
		t.setHight(2);

		double totalArea = totalArea(s);
		System.out.println(totalArea);

	}

	private static double totalArea(Shape[] s) {

		double totalArea = 0.0;

		for (int i = 0; i < s.length; i++) {
			System.out.println("area: " + s[i].area());
			totalArea = totalArea + s[i].area();
		}

		return totalArea;
	}

}
