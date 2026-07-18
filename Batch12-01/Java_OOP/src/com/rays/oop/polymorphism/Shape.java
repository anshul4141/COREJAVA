package com.rays.oop.polymorphism;

public class Shape {

	public void area() {
		System.out.println("area of shape");
	}

//	method reutrn type
	public static Shape getShape(int i) {

		if (i == 1)
			return new Circle();
		if (i == 2)
			return new Rectangle();
		if (i == 3)
			return new Triangle();
		return null;

	}
}
