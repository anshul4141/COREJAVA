package com.rays.oop.inheritance;

public class Rectangle extends Shape {

	private int lenght;
	private int widht;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidht() {
		return widht;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}

	public double area() {
		return lenght * widht;
	}

}
