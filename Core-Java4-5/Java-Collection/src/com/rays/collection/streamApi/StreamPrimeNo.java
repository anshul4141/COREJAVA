package com.rays.collection.streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamPrimeNo {
	
	public static boolean isPrime(int x) {
		int count = 0;

		if (x == 1) {

			return false;

		}

		for (int i = 2; i < x; i++) {

			if (x % i == 0) {

				count++;

			}
		}
		return count == 0;
	}

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);

		l.stream().filter(e -> isPrime(e)).forEach(e -> System.out.println(e));
	}

}
