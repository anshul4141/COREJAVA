package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File f = new File("D:\\Movie\\Raid.2018.1080p.BluRay.Hindi.5.1.x264.mkv");

		if (f.exists()) {
			
			System.out.println("file name: " + f.getName());
			System.out.println("absolute path: " + f.getAbsolutePath());
			System.out.println("can write: " + f.canWrite());
			System.out.println("can read: " + f.canRead());
			System.out.println("is this a file: " + f.isFile());
			System.out.println("is this a folder: " + f.isDirectory());
			Date d = new Date(f.lastModified());
			System.out.println("last modified date and time: " + d);
			System.out.println("size of file: " + f.length());
			
		} else {
			System.out.println("file not found");
		}

	}

}
