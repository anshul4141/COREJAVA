package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextFileBufferedReader {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("D:/IO/Sunilos.txt");

		BufferedReader in = new BufferedReader(file);

		String data = in.readLine();

		while (data != null) {

			System.out.println(data);
			data = in.readLine();

		}

		in.close();

	}

}
