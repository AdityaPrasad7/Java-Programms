package com.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password: ");
		String s = sc.next();
		sc.close();
		String regex = "^(?=.*[!@#$%&*+])(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8,}$";
		
		Pattern p = Pattern.compile(regex);
		
		System.out.println(p.matcher(s).matches() ? "Valid Password" : "Invalid Password");
	}

}
