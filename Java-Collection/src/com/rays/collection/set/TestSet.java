package com.rays.collection.set;

import java.util.HashSet;
import java.util.Set;

//1. set does not contain duplicate values
//2. set contain only one null values
//3. order of set is sorting order by default acs
public class TestSet {

	public static void main(String[] args) {

		Set s = new HashSet();
		
		s.add('b');
		s.add('a');
		s.add('b');
		s.add(null);
		s.add(null);
		
		System.out.println("set: " + s);
		System.out.println("size of set: " + s.size());

	}

}
