package com.training.org;

public class Employee {

	private int empId;
	private String empName;
	private double empSalary;

	//default constructor
	public Employee() {
		System.out.println("Default constructor of employee is called");
		this.empId = 0;
		this.empName = " ";
		this.empSalary = 0;
	}

	//Parameterized constructor
	public Employee(int empId, String empName, double salary) {
		System.out.println("Parameterized constructor");
		this.empId = empId;
		this.empName = empName;
		this.empSalary = salary;
	}

	public String getEmpName() {
		return empName;

	}

	public void setEmpName(String name) {
		this.empName = name;
	}

	public double getSalary() {
		return empSalary;
	}

	public void setSalary(double salary) {
		this.empSalary = salary;
	}

	public String toString() {
		return ("Employee details" + this.empId + " " + this.empName + " " + this.empSalary);
	}

}
