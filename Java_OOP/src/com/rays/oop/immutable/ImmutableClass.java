package com.rays.oop.immutable;

// make class final
public final class ImmutableClass {

	// make all attributes private and final
	private final String name;

	// define parameterized constructor to initialize final attribute
	public ImmutableClass(String name) {
		this.name = name;
	}

	// define only getter methods to fetch the attribute
	public String getName() {
		return name;
	}

}
