package com.Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("java");
		System.out.println(m.find());
		System.out.println(m.start());
		System.out.println(m.group());
		System.out.println(m.end());
//		int count = 0;
//		while(m.find()) {
//			count++;
//		}
//		System.out.println(count);
	}

}
