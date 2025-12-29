package com.rays.java8;

public interface HelloDefaultAndStatic {

	public default void defMethod() {
		System.out.println("this is default methode");
	}
	
	public static void statMethod() {
		System.out.println("this is static methode");
	}

}
