package com.training.com;

class MyException extends Exception{
	private String myMessage;
	public MyException() {
		System.out.println("Default constructor of MyException class is called");
		myMessage = "";
	}
	public MyException(String msg) {
		System.out.println("Parameterised constructor of MyException class is called");
		myMessage = msg;
	}
	public String getMyMessage() {
		return this.myMessage;	
	}
}

public class Throw {
	public static void main(String[] args) {
		int a = 0;
		try {
			if(a == 0) {
				throw new MyException("This is the Custom message");
			}
		} catch (MyException e) {
			System.out.println(e.getMyMessage());
		}
	}
}
