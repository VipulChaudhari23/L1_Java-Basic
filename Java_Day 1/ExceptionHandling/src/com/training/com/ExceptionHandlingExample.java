package com.training.com;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int a = 0;
		
		// Exception Handling.
		try {
			a = 100/0;

		}
		// ArithmeticException is the Specific Exception will execute mathematical types of exception.
		catch (ArithmeticException e) {
			System.out.println("FOUND ERROR "+ e.getMessage());
		}
		// Exception is the generic Exception will execute all types of exception.
		catch (Exception e) {
			System.out.println("FOUND ERROR "+ e.getMessage());
		}
		// finally block is always written after the Catch block
		finally {
			System.out.println("We are always with you");
		}
		System.out.println("Value of a " + a);
		System.out.println("ENDED");
	}

}
