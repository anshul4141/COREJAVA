package com.rays.oop.constructor;

public class Rectangle extends Shape {

	private int lenght;
	private int width;

	public Rectangle(int lenght, int widht) {
		this.lenght = lenght;
		this.width = widht;
	}

	public int getLenght() {
		return lenght;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public double area() {
		return lenght * width;
	}

}
