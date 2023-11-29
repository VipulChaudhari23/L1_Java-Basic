package com.training.org;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class Employee {
	private int empId;
	private String empName;
	private double empSalary;

	public Employee() {
		System.out.println("Default Constructor of Employee is Called");
		this.empId = 0;
		this.empName = "";
		this.empSalary = 0;
	}

	public Employee(int empId, String empName, double empSalary) {
		System.out.println("Parametarized Constructor of Employee is Called");
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String toString() {
		return "EmpId " + this.empId + " Name " + this.empName + " Salary " + this.empSalary;
	}
}

class Organization {
	private String orgName;
	private String orgLocation;

	// created the object of Employee class which is called as Containment.
	 private Employee emp;
	
	// created the Arraylist of employee emp as an object.
	ArrayList<Employee> emp;

	// in Containment the created object of class in main function is called first
	// not as Inheritance.
	// So here Organization Constructor is called first and then Employee
	// Constructor.

	public Organization() {
		System.out.println("Default Constructor of Organization is Called");
		this.orgName = "";
		this.orgLocation = "";
		this.emp = new ArrayList<Employee>();
	}

	public Organization(String orgName, String orgLocation) {
		System.out.println("Parametarized Constructor of Organization is Called");
		this.orgName = orgName;
		this.orgLocation = orgLocation;
//		this.emp = new Employee[size];
//		this.emp = new ArrayList<Employee>(size);

	}
	
	public Organization(String orgName, String orgLocation, ArrayList<Employee> empList) {
		System.out.println("Parametarized Constructor of Organization is Called");
		this.orgName = orgName;
		this.orgLocation = orgLocation;
		this.emp = empList;
	}
	
	public void addEmployee(int empId, String empName, double empSalary) {
		emp.add(new Employee(empId, empName, empSalary));
	}

	public String toString() {
//		return Arrays.toString(emp) + " orgName " + this.orgName + " Organization " + this.orgLocation;
		String store = 
		for (int i = 0; i < emp.size(); i++) {
			
		}
		return orgLocation;
	}
	
}

public class ContainmentEx {
	public static void main(String[] args) {
//		Organization mav = new Organization("Maveric", "Pune", 101, "Vipul", 10000);
//		System.out.println(mav);
		
		Employee empList[] = new Employee[5];
		empList[0] = new Employee(101, "Vipul", 10000);
		empList[1] = new Employee(102, "Yash", 20000);
		empList[2] = new Employee(103, "Vinay", 30000);
		empList[3] = new Employee(104, "Saiem", 40000);
		empList[4] = new Employee(105, "Neha", 50000);
		
		Organization org1=new Organization("MYOrg","pune",empList);
		System.out.println(org1);
		
//		Organization org1 = new Organization("MyOrg", "Pune", 5);
	}

}
