package com.rays.oop.methodoverriding;

public class Circle extends Shape {

	private int r;

	public Circle() {

	}

	public Circle(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public double area() {
		return 3.14 * r * r;
	}

}
