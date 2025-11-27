package com.rays.basic;

public class ReverseNo {

	public static void main(String[] args) {

		int i = 121;
		int r = 0;
		int reversNo = 0;

		while (i > 0) {
			r = i % 10;
			reversNo = (reversNo * 10) + r;
			i = i / 10;
		}
		
		System.out.println("reversNo: " + reversNo);

	}

}

//reversNo = 321