package com.exceptionHandling;

public class Test4 {
	public static void main(String[] args) {
		int [] a = {1,2,3};
		System.out.println("Main starts");
		try {
			System.out.println(a[0]/0);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("handled");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}
}
