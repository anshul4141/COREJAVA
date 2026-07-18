package com.rays.oop.abstraction;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Circle();
		
		Circle c = (Circle) s;
		s.area();
		c.setRadius(2);
		s.area();

	}

}
