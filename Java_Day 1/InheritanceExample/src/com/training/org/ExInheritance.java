package com.training.org;

// PArent Class is created 
class ParentClass{
	
	// A private data member is created 
	private int aVal;
	
	//ParentClass Default Constructor created
	public ParentClass() {
		System.out.println("Default Constructor of ParentClass is called");
		aVal = 0;
	}
	
	//ParentClass parameterized Constructor created
	public ParentClass(int aVal) {
		System.out.println("parameterized Constructor of ParentClass is called");
		this.aVal = aVal;
	}
	
//	public void showParentDetails() {
//		System.out.println("showParentDetails from the Parent Class is called:- " +aVal);
//	}
	
	public String toString() {
		return "showParentDetails from the Parent Class is called:- " +aVal+ " ";
	}
}

// ParentClass is Inherited to ChildClass class
class ChildClass extends ParentClass{
	// A private data member is created 
	private int bVal;
	
	//ChildClass Default Constructor created
	public ChildClass() {
		System.out.println("Default Constructor of ParentClass is called");
		bVal = 0;
	}
	
	//ChildClass parameterized Constructor created
	public ChildClass(int bVal, int aVal) {
		
		// this is calling ParentClass parameterized constructor
		super(aVal);
		
		System.out.println("Paramitarized Constructor of ParentClass is called");
		this.bVal = bVal;
	}

//	public void showChildDetails() {
//		super.showParentDetails();
//		System.out.println("showChildDetails from Child class is called:- " +bVal);
//	}
	
	public String toString() {
		return super.toString()+"showChildDetails from Child class is called:- " +bVal;
	}

}

public class ExInheritance {
	public static void main(String[] args) {
		ChildClass c1 = new ChildClass(100,200);
//		c1.showParentDetails();
//		c1.showChildDetails();
		System.out.println(c1);
	}
}
