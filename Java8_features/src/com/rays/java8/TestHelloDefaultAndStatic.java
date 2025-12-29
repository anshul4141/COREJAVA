package com.rays.java8;

public class TestHelloDefaultAndStatic {

	public static void main(String[] args) {

		HelloDefaultAndStatic.statMethod();

		HelloDefaultAndStatic h = new HelloDefaultAndStatic() {
		};
		
		h.defMethod();

	}

}
