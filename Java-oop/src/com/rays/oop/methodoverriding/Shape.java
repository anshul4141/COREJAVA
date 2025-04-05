package com.rays.oop.methodoverriding;

public abstract class Shape {

	protected String color;
	protected int borderWidth;
	public final double PI = 3.14;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public abstract double area();

}
