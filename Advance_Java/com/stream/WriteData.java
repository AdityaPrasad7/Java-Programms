package com.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\Admin\\Desktop\\myFolder\\javaa.txt");
		FileWriter f = new FileWriter(file);
		if(file.canWrite()) {
			f.write("Jspiders...\n");
			f.write("Qspiders...\n");
			f.write("Pyspiders...\n");
		}
		else {
			System.out.println("Can't write the data!");
		}
		f.close();
		System.out.println("Executed");
	}
}
