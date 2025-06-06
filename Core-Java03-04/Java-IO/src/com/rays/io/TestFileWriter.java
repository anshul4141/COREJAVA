package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("D:/IO/Hello.txt");
		
		file.write("Hello Ryas");
		
		System.out.println("data write successfully");
		
		file.close();

	}

}
