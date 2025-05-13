package com.rays.oop.polymorphism;

public class Circle1 extends Shape {

	private int radius;

	public Circle1(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public double area() {
		double area = 0.0;
		area = 3.14 * radius * radius;
		return area;
	}

}
