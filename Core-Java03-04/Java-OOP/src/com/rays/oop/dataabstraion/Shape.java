package com.rays.oop.dataabstraion;

public abstract class Shape {

	protected String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double area();

}
