package com.rays.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestStudentByIterator {

	public static void main(String[] args) {

		Student s1 = new Student("Ram", 101, "Maths");
		Student s2 = new Student("Shyam", 103, "English");
		Student s3 = new Student("Aman", 105, "Phy");
		Student s4 = new Student("Uday", 104, "Chm");
		Student s5 = new Student("Raman", 106, "Bio");
		Student s6 = new Student("Kamlesh", 102, "Comm");

		List<Student> list = new ArrayList<Student>();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()) {
			Student e = it.next();
			System.out.println(e);
		}

	}

}
