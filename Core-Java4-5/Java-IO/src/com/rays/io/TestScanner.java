package com.rays.io;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("type your age");

		int i = sc.nextInt();

		System.out.println("age = " + i);

		System.out.println("type you name");

		String str = sc.next();

		System.out.println("name = " + str);
		sc.close();

	}

}
