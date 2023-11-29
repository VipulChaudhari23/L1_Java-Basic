package com.training.org;

import java.util.HashMap;
import java.time.YearMonth;
import java.util.Map;

public class WageEmployee extends Employee {
	private int hours;
	private String month;
	private int year;
	private double netSalary = 0;
	private int date;
//	private int numberOfDays;
	private int PerDay = 0;
	private int PerHour = 0;

	public WageEmployee() {
		System.out.println("Default constructor of SalesEmployee is called");
		/*
		 * this.date=0; this.month=null; this.year=0; this.netSalary=0;
		 */
	}

	public WageEmployee(int empId, String empName, double salary, int hours) {
		super(empId, empName, salary);
		System.out.println("Parameterised constructor of SalesEmployee is called");
		// this.netSalary=0;
		this.month = " ";
		this.date = 0;
		this.year = 0;
		this.hours = hours;
	}

	// create the separate separate methods for each process.
	
	// noOfDayInMonth=calculate days in Dec month
//	public void monthToDay(String month, int year) {
//		System.out.println("Month is called");
//		Map<String, Integer> monthMap = new HashMap<>();
//		monthMap.put("January", 1);
//		monthMap.put("February", 2);
//		monthMap.put("March", 3);
//		monthMap.put("April", 4);
//		monthMap.put("May", 5);
//		monthMap.put("June", 6);
//		monthMap.put("July", 7);
//		monthMap.put("August", 8);
//		monthMap.put("September", 9);
//		monthMap.put("October", 10);
//		monthMap.put("November", 11);
//		monthMap.put("December", 12);
//
//		int monthValue = monthMap.get(month);
//		YearMonth yearMonth = YearMonth.of(year, monthValue);
//		this.numberOfDays = yearMonth.lengthOfMonth();
//		System.out.println("Number of days in " + month + " " + year + ": " + numberOfDays);
//	}
//
	// perDaySalary = 10000 / noOfDaysInMonth
//	public void PerDaySalary() {
//		this.PerDay = (int) (getSalary() / numberOfDays);
//		System.out.println("Perday Salary:-  Rs." + PerDay);
//	}
//
	// perHourSalary = perDaySalary / 8
//	public void PerHourSalary() {
//		this.PerHour = PerDay / 8;
//		System.out.println("PerHour Salary:- Rs." + PerHour);
//	}
//
	// netSalary = perHourSalary * noOfWorkingHours
//	public void NetSalary() {
//		System.out.println("Given Hours: "+this.hours + ", " +"Salary Per Hour: "+ this.PerHour);
//		this.netSalary = this.hours * this.PerHour;
//		System.out.println("NetSalary:- Rs." + netSalary+" for the given "+this.hours+ " Hours");
//	}
	
	// In single method apply the whole logic of Wege_Employee 
	public void CalculateWegeSalary(String month, int year) {
		
		// noOfDayInMonth = calculate days in Dec month
		System.out.println("Month is called");
		Map<String, Integer> monthMap = new HashMap<>();
		monthMap.put("January", 1);
		monthMap.put("February", 2);
		monthMap.put("March", 3);
		monthMap.put("April", 4);
		monthMap.put("May", 5);
		monthMap.put("June", 6);
		monthMap.put("July", 7);
		monthMap.put("August", 8);
		monthMap.put("September", 9);
		monthMap.put("October", 10);
		monthMap.put("November", 11);
		monthMap.put("December", 12);

		int monthValue = monthMap.get(month);
		YearMonth yearMonth = YearMonth.of(year, monthValue);
		int numberOfDays = yearMonth.lengthOfMonth();
		System.out.println("Number of days in " + month + " " + year + ": " + numberOfDays);
		
		// perDaySalary = 10000 / noOfDaysInMonth
		this.PerDay = (int) (getSalary() / numberOfDays);
		System.out.println("Perday Salary:-  Rs." + PerDay);
		
		// perHourSalary = perDaySalary / 8
		this.PerHour = PerDay / 8;
		System.out.println("PerHour Salary:- Rs." + PerHour);
		
		// netSalary = perHourSalary * noOfWorkingHours
		System.out.println("Given Hours: "+this.hours + ", " +"Salary Per Hour: "+ this.PerHour);
		this.netSalary = this.hours * this.PerHour;
		System.out.println("NetSalary:- Rs." + netSalary+" for the given "+this.hours+ " Hours");
	}
}
