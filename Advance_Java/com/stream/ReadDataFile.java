package com.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFile {
	public static void main(String[] args) throws IOException{
		FileInputStream f = new FileInputStream("C:\\\\Users\\\\Admin\\\\Desktop\\\\myFolder\\\\javaa.txt");
		int n = f.read();
		while(n != -1) {
			System.out.println((char)n);
			n = f.read();
		}
		f.close();
	}
}
