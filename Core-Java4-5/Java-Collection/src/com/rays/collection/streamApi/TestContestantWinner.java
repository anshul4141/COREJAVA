package com.rays.collection.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestantWinner {

	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("8985878546", "Amit"));
		list.add(new Contestant("7596325878", "Aastik"));
		list.add(new Contestant("9865325478", "Shubhank"));
		list.add(new Contestant("7536985245", "Aashima"));
		list.add(new Contestant("7896525369", "Sanjana"));
		list.add(new Contestant("9856515475", "Chetan"));
		list.add(new Contestant("8985878546", "Akbar"));
		list.add(new Contestant("8985878546", "Akbar"));
		list.add(new Contestant("7596325878", "Aastik"));

		// get the phoneNo
		System.out.println("phonNo:---------");
		list.stream().map(e -> e.phoneNo).forEach(System.out::println);

		// get valid phoneNo
		System.out.println("valid phonNo:-------------");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).forEach(System.out::println);

		// remove duplicate phoneNo
		System.out.println("remove duplicate phoneNo:-------------");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct().forEach(System.out::println);

		// shuffle phoneNo
		System.out.println("shuffle winner:------------");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).forEach(System.out::println);

//		// get 3 winner
//		System.out.println("shuffle winner:------------");
//		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct()
//				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
//					Collections.shuffle(e);
//					return e.stream();
//				})).limit(3).forEach(e -> System.out.println(e));

		// get 3 winner
		System.out.println("shuffle winner:------------");
		list.stream().map(e -> e.phoneNo + " = " + e.name)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}

}
