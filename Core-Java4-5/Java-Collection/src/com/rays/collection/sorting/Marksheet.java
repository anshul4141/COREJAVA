package com.rays.collection.sorting;

public class Marksheet {

	public int rollNo;
	public String name;
	public int phy;

	public Marksheet(int rollNo, String name, int phy) {
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;
	}

	public String toString() {
		return "rollNo: " + rollNo + " name: " + name + " phy: " + phy;
	}

}
