package com.rays.oop.overriding;

public class Shape {

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

	public void area() {
		System.out.println("area not privede by child class");
	}

}
