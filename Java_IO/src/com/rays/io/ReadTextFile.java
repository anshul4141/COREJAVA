package com.rays.io;

import java.io.FileReader;

public class ReadTextFile {

	public static void main(String[] args) throws Exception {

		// read single character only as int
		FileReader file = new FileReader("D://IO//Rays.txt");

		int i = file.read();

		while (i != -1) {
			System.out.println((char) i + " = " + i);
			i = file.read();
		}

		file.close();

	}

}
