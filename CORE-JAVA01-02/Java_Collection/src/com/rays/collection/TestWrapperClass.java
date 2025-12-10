package com.rays.collection;

public class TestWrapperClass {

	public static void main(String[] args) {

		String str = "1";

		int i = Integer.parseInt(str);
		
		System.out.println(i);
		
		long l = Long.parseLong(str);
		
		System.out.println(l);
		
		int sum = Integer.sum(5, 10);
		System.out.println(sum);

	}

}
