package com.rays.exception;

public class CheckedPropagation {
	
	public static void main(String[] args) {
		try {
			dad();
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		}
	}
	
	public static void dad() throws Exception {
		mom();
	}
	
	public static void mom() throws Exception {
		son();
	}
	
	public static void son() throws Exception {
		throw new Exception("make a mistake");
	}

}
