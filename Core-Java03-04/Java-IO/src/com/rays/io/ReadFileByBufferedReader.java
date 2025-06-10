package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileByBufferedReader {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("D://IO//Hello.txt"));

		String str = br.readLine();

		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		
		br.close();

	}

}
