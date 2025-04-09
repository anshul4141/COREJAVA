package com.rays.exception;

public class TestPrapogation {

	public static void main(String[] args) throws CheckedException {

		dad();

	}

	public static void dad() throws CheckedException {
		mom();
	}

	public static void mom() throws CheckedException {
		son();
	}

	public static void son() throws CheckedException {
		throw new CheckedException("make a mistake");
	}

}
