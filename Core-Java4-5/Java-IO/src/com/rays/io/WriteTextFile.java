package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("D://IO//Rays.txt" , true);

		file.write("\nHello World\nmy name is Sdfdhyam\nthis is my first programe\n");

		System.out.println("text write successfully");

		file.close();

	}

}
