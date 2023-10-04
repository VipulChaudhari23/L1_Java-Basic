package com.trainig.org;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		System.out.println("Default constructor of Employee is called");
		this.empId = 0;
		this.empName = "";
		this.salary = 0;
	}
	
	public Employee(int empId, String empName, double salary) {
		System.out.println("Parameterised Constructor of Employee is called");
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee details are" + this.empId+" "+this.empName+" "+this.salary;
	}
}




