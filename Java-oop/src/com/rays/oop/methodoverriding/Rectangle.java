package com.rays.oop.methodoverriding;

public class Rectangle extends Shape {

	private int l;
	private int w;

	public Rectangle() {

	}

	public Rectangle(int l, int w) {
		this.l = l;
		this.w = w;
	}

	public int getL() {
		return l;
	}

	public int getW() {
		return w;
	}

	@Override
	public double area() {

		return l * w;
	}

}
