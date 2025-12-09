package com.rays.collection.sorting;

public class Marksheet implements Comparable<Marksheet> {

	private String rollNo;
	private String name;
	private int phy;

	public Marksheet(String rollNo, String name, int phy) {
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;
	}

	@Override
	public int compareTo(Marksheet o) {
		// return this.phy - o.phy; // sort phy in asc order
		// return o.phy - this.phy; // sort phy in desc order
		return this.name.compareTo(o.name);  // sort rollNo is desc order
	}

	@Override
	public String toString() {
		return "rollNo: " + rollNo + " name: " + name + " phy: " + phy;
	}

}
