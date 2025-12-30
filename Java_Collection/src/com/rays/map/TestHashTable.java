package com.rays.map;

import java.util.Hashtable;
import java.util.Map;

public class TestHashTable {

	public static void main(String[] args) {

		Map m = new Hashtable();

		m.put("one", 1); // one = 1
		m.put("two", 2); // two = 2
		m.put("three", 3); // three = 3
		m.put("four", 4); // four = 4
		m.put("five", 5); // five = 5

		System.out.println(m);
		System.out.println(m.get("two"));
		System.out.println("six key: " + m.containsKey("six")); // containsKey check key members
		System.out.println("five key: " + m.containsKey("five"));
		System.out.println("6 value: " + m.containsValue(6)); // containsValue check value members
		System.out.println("5 value: " + m.containsValue(5));
		System.out.println("------------");
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		System.out.println("----------------");
		System.out.println(m.remove("five"));
		System.out.println(m);
		m.clear();
		System.out.println(m);

	}

}
