package com.rays.collection.sorting;

public class Marksheet implements Comparable<Marksheet> {

	private String name;
	private int rollNo;
	private int phy;

	public Marksheet(String name, int rollNo, int phy) {
		this.name = name;
		this.rollNo = rollNo;
		this.phy = phy;
	}

	@Override
	public String toString() {
		return "\n name: " + name + " | rollNo: " + rollNo + " | phy: " + phy + "\n";
	}

	@Override
	public int compareTo(Marksheet o) {
		// return this.rollNo - o.rollNo; // asc
		// return o.rollNo - this.rollNo; // desc
		// return this.phy - o.phy;
		return this.name.compareTo(o.name);
	}

}
