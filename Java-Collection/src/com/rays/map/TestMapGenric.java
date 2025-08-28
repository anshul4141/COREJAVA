package com.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestMapGenric {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "one");
//		map.put("1", "one"); // compilation error

	}
}
