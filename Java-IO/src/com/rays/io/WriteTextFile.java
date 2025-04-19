package com.rays.io;

import java.io.FileWriter;

public class WriteTextFile {

	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("D:/IO/Sunilos.txt", true);

		char[] charArry = { 'h', 'i' };

		fw.write(charArry);
		fw.write(',');
		fw.write("Amit ");

		System.out.println("Sucessfully........");

		fw.close();

	}

}
