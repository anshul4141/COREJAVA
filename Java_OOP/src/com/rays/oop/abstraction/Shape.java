package com.rays.oop.abstraction;

public abstract class Shape { // Shape is a abstract class

	protected String color;
	protected int borderWidth;

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

	public abstract double area(); // abstract method

}
