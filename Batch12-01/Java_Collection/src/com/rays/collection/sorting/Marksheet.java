package com.rays.collection.sorting;

public class Marksheet implements Comparable<Marksheet> {

	private int rollNo;
	private String name;
	private int phy;

	public Marksheet(int rollNo, String name, int phy) {
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;
	}

	@Override
	public String toString() {
		return "rollNo: " + rollNo + ", name: " + name + ", phy: " + phy;
	}

	@Override
	public int compareTo(Marksheet o) {
//		return this.rollNo - o.rollNo; // asc
//		return o.rollNo - this.rollNo; // desc
//		return this.name.compareTo(o.name); // asc
		return o.name.compareTo(this.name); // desc
	}

}
