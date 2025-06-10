package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) throws IOException {

		// Open file
		FileReader file = new FileReader("D:/IO/Hello.txt");

		// Read a char as ASCII or unicode
		int i = file.read();
		
		while(i != -1) {
			System.out.print((char) i);
			i = file.read();
		}
		
		file.close();

	}

}
