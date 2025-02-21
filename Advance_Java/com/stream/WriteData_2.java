package com.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData_2 {
	public static void main(String[] args) throws IOException{
		FileOutputStream f = new FileOutputStream("C:\\\\Users\\\\Admin\\\\Desktop\\\\myFolder\\\\javaa.txt",true);
				String s = "AMARAN";
				byte [] b = s.getBytes();
				f.write(b);
				f.close();
	}
}
