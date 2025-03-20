package com.rays.basic;

public class TestStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Ram");

		System.out.println("sb = " + sb);

		sb.append(" Yadav");

		System.out.println("sb = " + sb);

		/*
		 * sb.reverse();
		 * 
		 * System.out.println("sb = " + sb);
		 */

		sb.delete(0, 2);

		System.out.println("sb = " + sb);

	}

}
