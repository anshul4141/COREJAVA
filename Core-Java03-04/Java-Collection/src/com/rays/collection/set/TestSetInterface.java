package com.rays.collection.set;

import java.util.HashSet;
import java.util.Set;

//1. Set does not contain duplicate values
//2. Set contain only one null values
//3. Order of Set is sorting order in asc
public class TestSetInterface {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add(5);
		s.add(3);
		s.add(1);
		s.add(4);
		s.add(2);
		s.add(5);
		s.add(5);

		System.out.println("set: " + s);

	}

}
