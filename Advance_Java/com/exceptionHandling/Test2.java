package com.exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		try {
//			System.out.println(10/2);
			System.out.println(10/0.0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Handeled");
		}
		System.out.println("main ends");

	}

}
