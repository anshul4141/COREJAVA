package com.rays.io.externalizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestExternalizable {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Student e = new Student("ram", 1);

		// serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Student.txt"));
		out.writeObject(e);
		out.close();
		System.out.println("serialize successfully");
		
		// deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Student.txt"));
		e = (Student) in.readObject();
		System.out.println(e);
		in.close();
		System.out.println("deserializtion successfully");

	}

}
