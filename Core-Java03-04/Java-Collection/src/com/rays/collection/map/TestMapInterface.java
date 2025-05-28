package com.rays.collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestMapInterface {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put("one", 45);
		m.put("two", 45);
		m.put("three", 3);

		System.out.println("map: " + m);
		System.out.println(m.get("one"));

	}

}
