package com.rays.oop.polymorphism;

public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double area = 0.0;
		area = 3.14 * radius * radius;
		return area;
	}

}
