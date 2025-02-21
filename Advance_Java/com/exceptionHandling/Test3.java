package com.exceptionHandling;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("main starts");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Handled");       // Indicates the exception was caught
            System.out.println(e);               // Prints the exception class name and message
            System.out.println(e.getMessage());  // Prints just the message part
            e.printStackTrace();                 // Prints the full stack trace
        }
        System.out.println("main ends");
    }
}
