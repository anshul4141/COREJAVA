package com.rays.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPQueue {
	
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		
		q.add("Ram");
		q.add(5);
		
		System.out.println(q);
		
	}

}
