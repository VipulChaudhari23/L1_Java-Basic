package com.traininh.org;

public class NestedInnerClass {

	private String message;

	static int outerNum1 = 100;

	// simple nested inner class is created
	class InnerClass {
		private int num1;

		public InnerClass() {
			System.out.println("Default constructor of InnerClass is called");
		}

		public InnerClass(int num1) {
			System.out.println("Parametarised constructor of InnerClass is called");
		}

		// show() method of inner class
		public void show() {
			NestedInnerClass innerobj = new NestedInnerClass("New Message");
			innerobj.show();

			// print statement.
			System.out.println("In a nested class method" + this.num1 + " " +  message);
		}
	}

	static class InnerStatic {
		public void show() {
			System.out.println("Im in inside InnerStatic class show method " + outerNum1);
		}
	}

	public NestedInnerClass() {
		System.out.println("Defaul constructor of NestedInnerClass is called");
	}

	public NestedInnerClass(String message) {
		System.out.println("Parameterised constructor of NestedInnerClass is called");
		this.message = message;
	}

	public void show() {
		System.out.println("Thsi is show method from OuterClass" + this.message);
	}
}
