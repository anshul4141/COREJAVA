package com.rays.exception;

public class UnchekedPropagation {

	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void mom() {
		son();
	}

	public static void son() {
		throw new RuntimeException("make a mistake");
	}

}
