package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteTextFileBufferedWriter {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("D://IO//Rays.txt");

		BufferedWriter bw = new BufferedWriter(file);

		bw.write("Hello Rays");

		System.out.println("successfully");

		bw.close();

	}

}
