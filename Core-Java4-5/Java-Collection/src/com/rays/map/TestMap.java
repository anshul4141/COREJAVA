package com.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put(1, "one");
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);

		System.out.println(m.entrySet());
		System.out.println(m.get("four"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey("one"));
		System.out.println(m.containsValue(2));
		System.out.println(m.size());
		m.remove("three");
		System.out.println(m.entrySet());
		System.out.println(m.size());

	}

}
