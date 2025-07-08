package com.rays.oop.polymorphism;

public class TestShapeMethodArgument {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Triangle();
		s[2] = new Rectangle();

		Circle c = (Circle) s[0];
		Triangle t = (Triangle) s[1];
		Rectangle r = (Rectangle) s[2];

		c.setRadius(2);

		t.setBase(2);
		t.setHight(2);

		r.setLenght(2);
		r.setWidth(2);
		
		double area = calcArea(s);
		System.out.println(area);

	}

	public static double calcArea(Shape[] s) {

		double area = 0.0;

		for (int i = 0; i < s.length; i++) {
			
			System.out.println(s[i].area());

			area = area + s[i].area();

		}

		return area;

	}

}
