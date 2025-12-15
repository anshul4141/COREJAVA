package com.rays.oop.overriding;

public class Rectangle extends Shape {

	private int lenght;
	private int width;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void area() {
		System.out.println("area of rectangle");
	}

}
