package com.rays.basic;

public class StringAndStringBuffer {

	public static void main(String[] args) {

		String str = "Rays";

		String str1 = str.toLowerCase();

		System.out.println(str.toLowerCase());

		System.out.println("str: " + str);
		System.out.println("str1: " + str1);

		System.out.println("--------------");

		StringBuffer sb = new StringBuffer("Hello");

		System.out.println("sb: " + sb);

		System.out.println(sb.append(" Rays"));

		System.out.println("sb: " + sb);

	}

}
