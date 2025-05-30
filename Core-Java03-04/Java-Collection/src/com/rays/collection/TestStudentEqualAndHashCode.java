package com.rays.collection;

public class TestStudentEqualAndHashCode {

	public static void main(String[] args) {

		Student s1 = new Student(2, "Ram", 50000);
		Student s2 = new Student(2, "Ram", 50000);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
