package com.rays.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {

	public static void main(String[] args) throws Exception, IOException {

		Account a = new Account("8877744485888", 45660.01);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Account.txt"));

		// Convert Account class object into byte stream: serialization
		out.writeObject(a);

		out.close();
		System.out.println("object serialized successfully");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Account.txt"));

		// Convert byte stream into Account class object: deserialization
		System.out.println(in.readObject());

		in.close();

	}

}