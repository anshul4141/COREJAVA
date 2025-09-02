package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestantWinner {

	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Ram", "9985658259"));
		list.add(new Contestant("Shyam", "7858589858"));
		list.add(new Contestant("Ajay", "6965878587"));
		list.add(new Contestant("Vijay", "9985658259"));
		list.add(new Contestant("Jay", "7545896985"));
		list.add(new Contestant("Pappu", "7896325698"));
		list.add(new Contestant("InvalidNo", "11"));

		// Get the phone numbers
		System.out.println("<----Get the phone numbers---->");
		list.stream().map(e -> e.phone).forEach(e -> System.out.println(e));

		// Get valid phone numbers
		System.out.println("<----Get valid phone numbers---->");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(e -> System.out.println(e));

		// Remove duplicate phone numbers
		System.out.println("<----Remove duplicate phone numbers---->");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(e -> System.out.println(e));

		// Shuffle phone numbers
		System.out.println("<----Shuffle phone numbers---->");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}

}
