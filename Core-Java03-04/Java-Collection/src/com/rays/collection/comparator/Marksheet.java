package com.rays.collection.comparator;

public class Marksheet {

	public int rollNo;
	public String name;
	public int phy;

	public Marksheet(int rollNo, String name, int phy) {
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;
	}

	@Override
	public String toString() {
		return "RollNo: " + rollNo + " Name: " + name + " Phy: " + phy;
	}

}
