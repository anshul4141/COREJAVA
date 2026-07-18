package com.rays.oop.abstraction;

public class WebApp extends Ecom implements Dark, Light {

	@Override
	public void darkTheme() {
		System.out.println("switched to dark");
	}

	@Override
	public void lightTheme() {
		System.out.println("switched to light");
	}

}
