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
		System.out.println(s.peek());

	}

}
