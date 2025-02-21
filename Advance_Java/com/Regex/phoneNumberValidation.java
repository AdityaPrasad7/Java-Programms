package com.Regex;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class phoneNumberValidation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number: ");
		String s = sc.next();
		if(isPhoneNumber(s)) {
			System.out.println("It's a valid phone number");
		}
		else {
			System.out.println("not Valid");
		}
	}
	
	static boolean isPhoneNumber(String s) {
		String regex = "^[6-9][0-9]{9}$";
	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(s);
	return m.matches();
	}
}
