package com.stream;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TransferData {
	public static void main(String[] args) throws IOException{
		FileInputStream f = new FileInputStream("C:\\\\Users\\\\Admin\\\\Desktop\\\\myFolder\\\\javaa.txt");
		FileWriter fw = new FileWriter("C:\\\\Users\\\\Admin\\\\Desktop\\\\myFolder\\\\javaaa.txt");
		int n = f.read();
		while (n != -1) {
			fw.write((char)n);
			n = f.read();
		}
		System.out.println("Executed");
		f.close();
		fw.close();
	}
}
