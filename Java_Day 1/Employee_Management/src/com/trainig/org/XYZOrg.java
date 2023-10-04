package com.trainig.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class XYZOrg {
	public static void main(String[] args) {
		// creation of Array
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		// Initialize the Scanner (Scanner is used to take input values from user)
		Scanner input = new Scanner(System.in);
		char ch;
		int flag = 0;
		
		// Initialize do-while loop
		do {
			System.out.println("1] Add new record\n2] Display records\n3] Delete the Records\n4] Update Record\n\n");
			int choice = input.nextInt();
			
			// creating Switch case to add the employee details by using choice
			switch (choice) {
			
			// created case 1 to add details in the arrayList
			case 1:
				System.out.println("Enter empId");
				int id = input.nextInt();
				System.out.println("Enter empName");
				String name = input.next();
				System.out.println("Enter salary");
				double sal = input.nextInt();  
				
				empList.add(new Employee(id,name,sal));
				System.out.println("Record is added Successfully.....");
				break;
			
			// created case 2 to display the added details featch from arrayList
			case  2: 
				System.out.println("********** Employee Records are **********");
				
				// displaying the single-single records from the empList using for loop and auto iterate it as emp.
				System.out.println("-------------------------------------------");
				for(Employee emp : empList) {
					System.out.println(emp);
				}				
				System.out.println("-------------------------------------------");
				break;
			
			// create case 3 to delete the record using the name variable. 
			case 3: 
				System.out.println("Enter the Name to delete");
				String nm = input.next();
				
				// Normal iterate for loop to delete the records.
				for (int i = 0; i < empList.size(); i++) {
					if(empList.get(i).getEmpName().equals(nm)){
						
						// remove is to delete the record using the name variable.
						empList.remove(i);
						System.out.println("Record is deleted Successfully.......");
						
						// flag is to match the record if avaiable or not.
						flag = 1;
						break;
					}
					
				}
				if(flag == 0) {
					System.out.println("Record is not avaiable");
				}
				break;
				
			// create case 4 to update the record.
			case 4: 
				System.out.println("4.1] Update Name\n4.2] Update Salary");
				int choice1 = input.nextInt();
				switch (choice1) {
				case 1:
					System.out.println("Enter the old name to update");
					String nmOld = input.next();
					for (int i = 0; i < empList.size(); i++) {
						if(empList.get(i).getEmpName().equals(nmOld)) {
							System.out.println("Enter the name to replace with "+nmOld+" name");
							String nuNew = input.next();
							empList.get(i).setEmpName(nuNew);
							System.out.println("Update the name Successfully.....");
							flag = 1;
							break;
						}
					}
					if(flag == 0) {
						System.out.println("Record not found for deletion");
					}
					break;
				
				case 2:
					System.out.println("Provide Year Increment for employee with condition");
					
					System.out.println("Engter the salary for condition.....");
					int checksal = input.nextInt();
					
					System.out.println("Enter increment precentage");
					double incrementPer = input.nextDouble();
					
					for (int i = 0; i < empList.size(); i++) {
						if(empList.get(i).getSalary()<checksal) {
							empList.get(i).setSalary(empList.get(i).getSalary() * (incrementPer/100+1));
						}
						System.out.println("Updated the salary successfully");
						break;
					}
					
				default:
					break;
				}
				break;
	
			default:
				System.out.println("Invaid choice........");
				break;
			}
			
		System.out.println("Do you wnat to continue");
		// Initialize the ch as input and chatAt(0) "as the first character i.e 'y'" 
		ch = input.next().charAt(0);
			
		// declare the y and n to continue the loop
		}while(ch == 'y' || ch == 'Y');
		System.out.println("I'm Done");
		
		// creating the default constructor form Employee.java
		Employee e1 = new Employee();
		System.out.println(e1);
		
		//creating the parameterized constructor form Employee.java
		Employee e2 = new Employee(101, "Vipul", 10000);
		System.out.println(e2);
	}
}