package com.rays.oop.abstraction;

public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println(Math.PI * radius * radius);
	}

}
