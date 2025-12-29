package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferedReader {
	
	public static void main(String[] args) throws Exception {

		BufferedReader file = new BufferedReader(new FileReader("D://IO//Hello.java"));

		String line = file.readLine();

		while (line != null) {
			System.out.println(line);
			line = file.readLine();
		}

		file.close();

	}

}
