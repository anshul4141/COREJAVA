package com.rays.collection.list;

import java.util.Stack;

// last in first out
// first in last out
public class TestStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char ch = 'a'; ch <= 'z'; ch++) {

			s.push(ch);

		}

		System.out.println("stack: " + s);

		Stack s1 = new Stack();

		while (!s.isEmpty()) {

			s1.push(s.pop());

		}

		System.out.println("s1: " + s1);
		System.out.println(s);

	}

}
