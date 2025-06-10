package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// serialization
		Employee e = new Employee(1, "Ram");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/IO/Employee.dat"));
		out.writeObject(e);
		System.out.println("object serializ successfully");
		out.close();

		// deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/IO/Employee.dat"));
		e = (Employee) in.readObject();
		System.out.println(e);
		in.close();

	}

}
