package com.training.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileInputStream fIn = new FileInputStream("Myfile.exe");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
