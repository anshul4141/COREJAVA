package com.rays.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		
		q.offer('a');
		q.offer("Hello");
		q.offer('b');
		q.offer('c');
		
		System.out.println(q);
		
	}

}
