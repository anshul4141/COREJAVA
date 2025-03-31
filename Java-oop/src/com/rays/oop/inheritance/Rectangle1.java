package com.rays.oop.inheritance;

public class Rectangle1 extends Shape {

	private int lenght;
	private int width;

	public Rectangle1() {

	}

	public Rectangle1(int lenght, int widht) {
		this.lenght = lenght;
		this.width = widht;
	}

	public int getLenght() {
		return lenght;
	}

	public int getWidth() {
		return width;
	}

	public double area() {
		return lenght * width;
	}

}
