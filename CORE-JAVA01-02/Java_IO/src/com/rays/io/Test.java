package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {

	public static void main(String[] args) throws Exception {

		File file = new File("D://IO//SplitFile.txt");
		BufferedReader fileToCount = new BufferedReader(new FileReader(file));

		int count = 0;
		String s = fileToCount.readLine();

		while (s != null) {
			count++;
			s = fileToCount.readLine();
		}

		System.out.println("Total Lines in the file: " + count);

		BufferedReader br = new BufferedReader(new FileReader(file));

		for (int i = 1; i <= count; i = i + 2) {

			String line1 = br.readLine();
			String line2 = br.readLine();

			System.out.println("create file " + i);

			BufferedWriter bw = new BufferedWriter(new FileWriter("D://IO//Split" + i + ".txt"));

			if (line1 != null) {
				bw.write(line1);
				bw.newLine();
			}

			if (line2 != null) {
				bw.write(line2);
			}

			bw.close();
		}

		br.close();
		fileToCount.close();
		System.out.println("File splited");
	}

}
