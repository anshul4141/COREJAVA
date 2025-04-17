package com.rays.collection.streamApi;

import java.util.Arrays;
import java.util.List;

public class SteamStartWithT {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Tkh", "tkjh", "Tkjh", "Ahgvh", "Njgj");

		list.stream().map(e -> e.toUpperCase()).filter(e -> e.startsWith("t")).distinct().forEach(System.out::println);

	}

}
