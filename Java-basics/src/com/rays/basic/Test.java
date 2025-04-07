package com.rays.basic;

import java.util.Scanner;

public class Test {

	String name;
	int id;
	double balance;

	public Test(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public static Test[] getEmployee() {

		String name;
		int id;
		double balance;

		Scanner sc = new Scanner(System.in);
		Test[] t = new Test[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Enter employee detail:");
			System.out.print("Enter name: ");
			name = sc.nextLine();

			System.out.print("Enter id: ");
			id = sc.nextInt();

			System.out.print("Enter balance: ");
			balance = sc.nextDouble();

			sc.nextLine(); // change the line

			t[i] = new Test(name, id, balance);
		}

		sc.close();

		System.out.println("Data entry finished");
		return t;
	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", balance=" + balance + "";
	}

	public static void main(String[] args) {

		Test[] test = Test.getEmployee();

		for (Test t : test) {
			System.out.println(t);
		}

	}
}
