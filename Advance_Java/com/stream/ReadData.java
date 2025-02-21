package com.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
	public static void main(String[] args) throws IOException{
		FileReader f = new FileReader("C:\\\\Users\\\\Admin\\\\Desktop\\\\myFolder\\\\javaa.txt");
		BufferedReader bf = new BufferedReader(f);
		String s = bf.readLine();
		int count = 0;
		while(s != null) {
			count++;
			System.out.println(s);
			
			s = bf.readLine();
		}
		bf.close();
		System.out.println("count"+count);
	}
}
