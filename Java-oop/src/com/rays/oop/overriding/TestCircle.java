package com.rays.oop.overriding;

public class TestCircle {

	public static void main(String[] args) {

		Shape s1 = new Circle();

		Circle c = (Circle) s1;

		c.setRadius(2);

		System.out.println(s1.area());

	}

}
