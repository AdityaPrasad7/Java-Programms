package com.exceptionHandling;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(10/0.0); //infinity
		System.out.println(5.5/0.0); //infinity
		System.out.println(4.5/0); //infinity
		//System.out.println(10%0); //Arithmetic exception
		//System.out.println(5/0); //Arithmetic exception
		System.out.println("main ends");
	}
}
