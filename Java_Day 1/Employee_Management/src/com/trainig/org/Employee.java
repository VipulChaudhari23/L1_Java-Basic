package com.trainig.org;

public class Employee {
	// Variable declare 
	private int empId;
	private String empName;
	private double salary;
	
	// Default Constructor created
	public Employee() {
		System.out.println("Default constructor of Employee is called");
		this.empId = 0;
		this.empName = "";
		this.salary = 0;
	}
	
	// Parameterized Constructor created
	public Employee(int empId, String empName, double salary) {
		System.out.println("Parameterised Constructor of Employee is called");
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	// create getter for the empName
	public String getEmpName() {
		return empName;
	}
	
	// Create the setter for the empName as the NewName
	public void setEmpName(String NewName){
		this.empName = NewName;
	}
	
	// create getter for the salary
	public double getSalary() {
		return salary;
	}
	
	// Create the setter for the salary as the NewSalary.
	public void setSalary(double NewSalary) {
		this.salary = NewSalary;
	}
	
	// toString is to automatically display the object data and function member.
	public String toString() {
		return "Employee details are " + this.empId+" "+this.empName+" "+this.salary;
	}
}




