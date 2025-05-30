package com.rays.collection.comparable;

public class Marksheet implements Comparable<Marksheet> {

	public int rollNo;
	public String name;
	public int phy;

	public Marksheet(int rollNo, String name, int phy) {
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;
	}

	@Override
	public int compareTo(Marksheet o) {
		// return this.rollNo - o.rollNo;
		// return o.rollNo - this.rollNo;
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "RollNo: " + rollNo + " Name: " + name + " Phy: " + phy;
	}

}
