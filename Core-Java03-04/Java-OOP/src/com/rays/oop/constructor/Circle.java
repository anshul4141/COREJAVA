package com.rays.oop.constructor;

public class Circle extends Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return this.radius;
	}

	@Override
	public double area() {

		return 3.14 * radius * radius;
	}

}
