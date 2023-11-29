package com.trainig.org;

public class SalesEmployee extends Employee{
	// created the private variable
	private int sales;
	private double commission;
	private double netSalary;
	
	// created the default constructor
	public SalesEmployee() {
		System.out.println("Default constructor of SalesEmployee is called");
		this.sales=0;
		this.commission=0;
		this.netSalary=0;
	}

	// created the Parameterized constructor
	public SalesEmployee(int empId,String empName,double salary,int sales) {
		super(empId,empName,salary);
		System.out.println("Parameterised constructor of SalesEmployee is called");
		this.sales = sales;
		this.commission = 0;
		this.netSalary = 0;
	}
	
	// calling the base class Parameterized constructor using the toString.
	public String toString() {
		return super.toString()+ "Sales "+this.sales+" Commission "+this.commission+" Net Salary"+this.netSalary;
	}
	
	// calculate the commission using the salary
	public void calculateSalary() {
		if(sales < 5000) {
			commission = getSalary() * 0.05;
		}
		else if(sales >= 5000 && sales < 10000) {
			commission = getSalary() * 0.07;
		}
		else if(sales >= 10000 && sales < 15000) {
			commission = getSalary() * 0.10;
		}
		else if(sales >= 15000) {
			commission = getSalary() * 0.15;
		}
		
		else {
			System.out.println("Commission not alloed");
		}
		netSalary = getSalary() + commission;
	}


}

