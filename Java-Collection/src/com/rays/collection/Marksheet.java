package com.rays.collection;

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
	public int compareTo(Marksheet o) {
		return o.rollNo - this.rollNo;
	}

	@Override
	public String toString() {
		return "rollNo: " + rollNo + " name: " + name + " phy: " + phy + "";
	}

}
