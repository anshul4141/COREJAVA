package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyValidEmail {

	public static void main(String[] args) throws Exception {

		FileReader source = new FileReader("D://IO//Email.txt");
		FileWriter target = new FileWriter("D://IO//ValidEmail.txt");

		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(target);

		String email;

		while ((email = br.readLine()) != null) {

			if (email.endsWith("@gmail.com")) {

				System.out.println(email);
				bw.write(email);
				bw.newLine();
				email = br.readLine();

			}

		}

		br.close();
		bw.close();

	}

}
