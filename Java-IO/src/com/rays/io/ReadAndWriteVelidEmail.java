package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteVelidEmail {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("D://IO//Email.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("D://IO//ValidEmail.txt"));

		String str;

		while ((str = in.readLine()) != null) {

			if (str.endsWith("@gmail.com")) {
				System.out.println("email: " + str);
				out.write(str);
				out.newLine();
			}

		}

		in.close();
		out.close();

	}

}
