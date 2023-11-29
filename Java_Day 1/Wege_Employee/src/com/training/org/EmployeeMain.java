package com.training.org;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {

		public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
	        System.out.println("Enter the Date: ");
	        int date = input.nextInt();
	        String month = input.next();
	        int year = input.nextInt();
	        int hours = input.nextInt();


	        WageEmployee example = new WageEmployee(1001, "Vipul", 23500, hours);
//	        example.monthToDay(month, year);
//	        example.PerDaySalary();
//	        example.PerHourSalary();
//	        example.NetSalary();
	        
	        example.CalculateWegeSalary(month, year);

		
		}
	}