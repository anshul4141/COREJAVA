package com.rays.collection.list;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack s1 = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {
			s1.push(c);
		}

		System.out.println(s1);
		
		Stack s2 = new Stack();

		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		System.out.println(s2);
	}

}
