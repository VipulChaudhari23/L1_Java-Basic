package com.trainig.com;

// created the Abstract class 
abstract class ParentClass{
	public void displayParent() {
		System.out.println("displaying method from parentclass is called");
	}
	
	// created the unimplemented method with sould be abstrate by default
	public abstract void show();
}

// created the ChildClass which inherits the ParentClass which is abstract class 
class ChildClass extends ParentClass{

	// So as the ParentClass is abstract class and the show method is unimplemented we need to Override the method show in ChildClass 
	@Override
	public void show() {
		System.out.println("show method for the childclass is called");
	}
	// displayParent2 is the unique method of the ChildClass
	public void displayParent2() {
		System.out.println("displaying method from parentclass2 is called");
	}
}

//created the Child2Class which inherits the ParentClass
class Child2Class extends ParentClass{

	// So as the ParentClass is abstract class and the show method is unimplemented we need to Override the method show in ChildClass 
	@Override
	public void show() {
		System.out.println("show method for the child2class is called");
	}
}

class Child3Class extends ChildClass{
//	public void show() {
//		System.out.println("child3class is extended to ChildClass");
//	}
}

public class AbstractClassExample {
	public static void main(String[] args) {
		// created the type p1 of ChildClass as object and Reference is to parent class
		ParentClass p1 = new ChildClass();
		// type cast the ChildClass of displayParent2 which is the unique method of ChildClass.
		((ChildClass)p1).displayParent2();
		p1.displayParent();
		p1.show();
		
		
		// created the type of Child2Class as object and Reference is to parent class
//		p1 = new Child2Class();
//		p1.displayParent();
//		p1.show();	
//		
//		// created the object of Child3Class Reference to parent class.
		Child3Class c1 = new Child3Class();
		c1.show();

		
	}
}
