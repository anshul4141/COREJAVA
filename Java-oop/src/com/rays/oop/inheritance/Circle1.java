package com.rays.oop.inheritance;

public class Circle1 extends Shape {

	private int radius;

	public Circle1() {

	}

	public Circle1(int radius) {

		this.radius = radius;

	}

	public int getRadius() {
		return this.radius;
	}

	public double area() {
		double area = 0.0;
		area = Math.PI * radius * radius;
		return area;
	}

}
