package com.rays.oop;

public class TestBusinessman {

	public static void main(String[] args) {

		Tata t = new Tata();
		Akshat a = new Akshat();

		t.setName("Ratan Tata");
		System.out.println(t.getName());
		t.earnMoney();
		t.donation();
		t.party();
		t.helpToOther();

		System.out.println("------------------");

		a.setName("Akshat");
		System.out.println(a.getName());
		a.earnMoney();
		a.donation();
		a.party();

	}

}
