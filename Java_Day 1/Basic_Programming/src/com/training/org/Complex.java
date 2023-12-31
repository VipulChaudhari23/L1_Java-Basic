package com.training.org;

import java.awt.JobAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author vipulp
 *
 */
public class Complex {
	private int real;
	private int imag;
	
	// Default Constructor
	public Complex() {
		System.out.println("Default constructor of complex is called");
		real = 0;
		imag = 0;
	}
	
	// parameterized constructor
	public Complex(int real, int imag) {
		System.out.println("parameterized Constructor of Complex class is called");
		this.real = real;
		this.imag = imag;
	}
	
	public void acceptComplexValues() throws IOException {
		//First Method(Older way to accept values i.e Buffer method) 
//		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the values for real");
//		this.real = Integer.parseInt(input.readLine());
//		
//		System.out.println("Enter the values for imag");
//		this.imag = Integer.parseInt(input.readLine());
//		
		
		// Second Method (new method scanner method)
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values for the real");
		this.real = input.nextInt();
		
		System.out.println("Enter the values for the imag");
		this.imag = input.nextInt();
		
		
		// Third Method (JOptionPane method)
//		this.real = Integer.parseInt(JOptionPane.showInputDialog("Enter the values of real"));
//		this.imag = Integer.parseInt(JOptionPane.showInputDialog("Enter the values of imag"));
//		JOptionPane.showMessageDialog(null, "Values are " + this.real+" "+this.imag);
		
	}
	
	public void ShowComplexValues() {
		System.out.println("Complex Values are "+real+" "+imag);
	}
	
	public String toString() {
		return ("Complex values of real and imag are "+real+" "+imag);
	}
	
	public static void main(String[] args) throws IOException {
		// Create object for the Default Constructor.
		Complex c1 = new Complex();
		// Accepting the values form the user 
		c1.acceptComplexValues();
//		c1.ShowComplexValues();
		System.out.println(c1);
		
		// Create object for the parameterized Constructor.
		Complex c2 = new Complex(100, 200);
		c2.ShowComplexValues();
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("I: " + i);
//		}
	}
	
}
