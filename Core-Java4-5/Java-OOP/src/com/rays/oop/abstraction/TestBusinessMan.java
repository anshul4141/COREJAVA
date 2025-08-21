package com.rays.oop.abstraction;

public class TestBusinessMan {

	public static void main(String[] args) {

		Richman r = new Businessman();

		r.donation();
		r.party();
		r.earnMoney();

		SocialWorker s = new Businessman();

		s.helopToOther();

		Businessman bs = new Businessman();
		bs.getName();
		bs.donation();

	}

}
