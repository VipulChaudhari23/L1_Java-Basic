package com.training.com;

//to illustrate the effect of not handling the exception.

//public class ExceptionUnhandled {
//	public static void main(String args[]) {
//		int a = 10, b = 0, c;
//		System.out.println("Hello 1");
//
//		c = a / b;
//		System.out.println(c);
//
//		System.out.println("Hello 2");
//		System.out.println("Hello 3");
//	}
//}


// Handle the Exception for the above classs
public class SirExample {
	public static void main(String[] args) {
		int a = 10, b = 0, c;
		System.out.println("Hello 1");

		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hello 2");
		System.out.println("Hello 3");
	}
}
