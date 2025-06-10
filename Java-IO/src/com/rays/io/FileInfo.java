package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File f = new File("D:\\IO\\Hello.txt");

		if (f.exists()) {
			System.out.println("file name: " + f.getName());
			System.out.println("path: " + f.getAbsolutePath());
			System.out.println("can write: " + f.canWrite());
			System.out.println("can read: " + f.canRead());
			System.out.println("is file: " + f.isFile());
			System.out.println("is directory: " + f.isDirectory());
			Date d = new Date(f.lastModified());
			System.out.println("last modified: " + d);
		} else {
			System.out.println("file not found");
		}

	}

}
