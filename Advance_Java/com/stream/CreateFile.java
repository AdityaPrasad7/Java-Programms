package com.stream;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 
	     File file = new File("Desktop/myFolder/javaa.txt");
		
		//System.out.println(file.mkdir());
		
		System.out.println(file.createNewFile());
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		
		System.out.println(file.getAbsolutePath());
	}
}
