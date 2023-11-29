package com.traininh.org;

import com.traininh.org.NestedInnerClass.InnerClass;

class Demo {

	// Method of helper class
	void show() {
		// Print statement
		System.out.println("i am in show method of super class");
	}
}

//Java Program to Illustrate Anonymous Inner Classes
//Declaration Without Any Name
//As an implementer of Specified interface

//Interface
interface Hello {

// Method defined inside interface
void show();
}

public class MainClass {
	
	// Class implementing interface
	 static Hello h = new Hello() {
	     // Method 1
	     // show() method inside main class
	     public void show()
	     {
	         // Print statement
	         System.out.println("i am in anonymous class");
	     }
	 };

	 // Method 2
	 // Main driver method

	// An anonymous class with Demo as base class
	static Demo d = new Demo() {
		// Method 1
		// show() method
		void show() {
			// Calling method show() via super keyword
			// which refers to parent class
			super.show();

			// Print statement
			System.out.println("i am in Flavor1Demo class");
		}
	};

	public static void main(String[] args) {

//		System.out.println("Argument Values " + args[0] + " "+ args[1]);
//
//		InnerClass obj1 = new NestedInnerClass().new InnerClass();
//		obj1.show();
//		InnerClass obj1 = new NestedInnerClass("Hii Vipul").new InnerClass(100);
//		obj1.show();
//
//		NestedInnerClass.InnerStatic obj3 = new NestedInnerClass.InnerStatic();

//		NestedInnerClass obj2 = new NestedInnerClass();
//		obj2.show();

//		d.show();
		
		// Calling show() method inside main() method
	     h.show();

	}

}

