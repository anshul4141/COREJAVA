package com.rays.oop.abstraction;

public class TestBusinessman {
	
	public static void main(String[] args) {
		
		Richman r = new Businessman();
		
		r.donation();
		r.earnMoney();
		r.party();
		
		System.out.println("---------------");
		
		SocialWorker s = new Businessman();
		
		s.helpToOthers();
		
		System.out.println("---------------");
		
		Businessman bm = new Businessman();
		
		bm.donation();
		bm.earnMoney();
		bm.helpToOthers();
		bm.party();
	}

}
