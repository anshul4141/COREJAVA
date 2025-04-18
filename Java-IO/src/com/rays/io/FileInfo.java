package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File f = new File("D:\\IO\\Hello.txt");

		if (f.exists()) {

			System.out.println("can write: " + f.canWrite());
			System.out.println("can read: " + f.canRead());
			System.out.println("is file: " + f.isFile());
			System.out.println("is directory: " + f.isDirectory());
			Date lastModified = new Date(f.lastModified());
			System.out.println("lastmodified: " + lastModified);
			System.out.println("size of file: " + f.length());

		} else {
			System.out.println("file does not exists");
		}

	}

}
