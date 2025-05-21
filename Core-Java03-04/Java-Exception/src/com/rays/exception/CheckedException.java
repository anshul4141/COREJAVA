package com.rays.exception;

public class CheckedException {

	public static void main(String[] args) throws Exception {

		dad();

	}

	public static void dad() throws Exception {

		mom();

	}

	public static void mom() throws Exception {

		son();

	}

	public static void son() throws Exception {

		throw new Exception("Make a mistake");

	}

}
