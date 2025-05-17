package com.rays.oop.dataabstraion;

public class TestBusnessman {

	public static void main(String[] args) {

		Richman r = new Busnessman();
		r.donation();
		r.party();
		r.earnMoney();

		SocialWorker s = new Busnessman();
		s.helpToOther();
		
		Busnessman b = new Busnessman();

	}

}
