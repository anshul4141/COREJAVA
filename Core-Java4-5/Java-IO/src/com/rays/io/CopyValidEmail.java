package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyValidEmail {

	public static void main(String[] args) throws Exception {

		BufferedReader oldEmail = new BufferedReader(new FileReader("D://IO//Email.txt"));

		BufferedWriter newEmail = new BufferedWriter(new FileWriter("D://IO//ValidEmail.txt"));

		String email = oldEmail.readLine();

		while (email != null) {
			if (email.endsWith("@gmail.com")) {
				System.out.println("valid email : " + email);
				newEmail.write(email);
				newEmail.newLine();
			}
			email = oldEmail.readLine();
		}

		System.out.println("valid email copy successfully");
		oldEmail.close();
		newEmail.close();

	}

}
