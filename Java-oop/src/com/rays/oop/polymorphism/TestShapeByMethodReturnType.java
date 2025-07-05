package com.rays.oop.polymorphism;

public class TestShapeByMethodReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(3); // new Rectangle();
		s[1] = Shape.getShape(2); // new Triangle();
		s[2] = Shape.getShape(1); // new Circle();

		Rectangle r = (Rectangle) s[0];
		Triangle t = (Triangle) s[1];
		Circle c = (Circle) s[2];

		r.setLenght(2);
		r.setWidth(2);

		t.setBase(5);
		t.setHight(5);

		c.setRadius(5);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		}

	}

}
