package com.rays.oop.polymorphism;

public class TestShapeByArrayConstructor {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle1(2);
		System.out.println("area of circle: " + s[0].area());

	}

}
