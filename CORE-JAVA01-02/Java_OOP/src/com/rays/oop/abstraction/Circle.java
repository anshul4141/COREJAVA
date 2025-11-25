package com.rays.oop.abstraction;

public class Circle extends Shape { // now Circle is a concrete class

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
