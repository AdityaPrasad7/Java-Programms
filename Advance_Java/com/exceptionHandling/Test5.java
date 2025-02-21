package com.exceptionHandling;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = null;
		System.out.println("Main starts");
		try {
			System.out.println(a.length());
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Handled");
			System.out.println(e);
		}
		System.out.println("main ends");
	}

}
