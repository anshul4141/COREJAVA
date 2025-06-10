package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileByBufferedWriter {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter br = new BufferedWriter(new FileWriter("D:/IO/Ram.txt"));
		
		br.write("Hello Sita Ram");
		
		System.out.println("write successfully");
		
		br.close();
		
	}

}
