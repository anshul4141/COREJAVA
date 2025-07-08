package com.rays.oop.polymorphism;

public class Shape {

	public double area() {
		return 0.0;
	}

	public static Shape getShape(int i) {

		if (i == 1) {
			return new Circle();
		}

		if (i == 2) {
			return new Triangle();
		}

		if (i == 3) {
			return new Rectangle();
		}

		return new Shape();

	}

}
