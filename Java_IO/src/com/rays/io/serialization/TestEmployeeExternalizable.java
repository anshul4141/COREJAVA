package com.rays.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee(1, "Ram");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Employee.xls"));

		out.writeObject(e);

		out.close();

		System.out.println("object serialized successfully");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Employee.xls"));

		System.out.println(in.readObject());

		in.close();

	}

}