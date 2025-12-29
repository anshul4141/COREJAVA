package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File file = new File("D:\\IO\\Hello.txt"); // file open

		if (file.exists()) {
			System.out.println("file name: " + file.getName());
			System.out.println("file path: " + file.getAbsolutePath());

			System.out.println("Access permission");
			System.out.println("writable: " + file.canWrite());
			System.out.println("readable: " + file.canRead());

			System.out.println("check if it is a folder/directory or a file");
			System.out.println("is file: " + file.isFile());
			System.out.println("id folder/directory: " + file.isDirectory());

			System.out.println("Last modified date of file, folder/directory");
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("lastModifiedDate: " + lastModifiedDate);
			System.out.println(file.length());

		} else {
			System.out.println("file not found");
		}

	}

}
