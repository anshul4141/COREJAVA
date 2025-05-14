package com.rays.oop.polymorphism;

public class TestShapeByReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1); // s[0] = new Circle();
		s[1] = Shape.getShape(2); // s[1] = new Triangle();
		s[2] = Shape.getShape(3); // s[2] = new Rectangle();

		Circle c = (Circle) s[0];
		c.setRadius(2);

		Rectangle r = (Rectangle) s[2];
		r.setLenght(2);
		r.setWidth(2);

		Triangle t = (Triangle) s[1];
		t.setBase(2);
		t.setHight(2);

		for (Shape shape : s) {
			System.out.println(shape.area());
		}

	}

}
