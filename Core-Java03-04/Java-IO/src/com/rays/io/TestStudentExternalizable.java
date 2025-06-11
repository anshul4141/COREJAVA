package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentExternalizable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Student s = new Student(1, "Ram");

		// serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/IO/Student.dat"));
		out.writeObject(s);
		System.out.println("object serializ successfully");
		out.close();

		// deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/IO/Student.dat"));
		s = (Student) in.readObject();
		System.out.println(s);
		in.close();

	}

}
