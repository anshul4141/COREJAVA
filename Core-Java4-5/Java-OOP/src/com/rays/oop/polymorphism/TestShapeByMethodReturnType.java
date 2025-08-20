package com.rays.oop.polymorphism;

public class TestShapeByMethodReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		
		s[0] = Shape.getShape(1); // new Circle();
		s[1] = Shape.getShape(2); // new Rectangle();
		s[2] = Shape.getShape(3); // new Triangle();
		
		
	}

}
