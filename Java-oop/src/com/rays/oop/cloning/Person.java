package com.rays.oop.cloning;

public class Person implements Cloneable {

	public int id;
	public String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
