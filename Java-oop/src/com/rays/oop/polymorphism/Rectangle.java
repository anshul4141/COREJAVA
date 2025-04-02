package com.rays.oop.polymorphism;

public class Rectangle extends Shape {

	private int lenght;
	private int widht;

	public Rectangle() {
	}

	public Rectangle(int lenght, int widht) {
		this.lenght = lenght;
		this.widht = widht;
	}

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

	@Override
	public double area() {
		return lenght * widht;
	}

}
