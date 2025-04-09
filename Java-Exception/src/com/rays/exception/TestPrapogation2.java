package com.rays.exception;

public class TestPrapogation2 {

	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		
			mom();
		
	}

	public static void mom() {
		son();
	}

	public static void son() {
		throw new UncheckedException("make a mistake");
	}

}
