package com.training.org;

import java.util.Scanner;

public class Que3 {
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int N = input.nextInt();
	    int x = 2;

	    for(int i = 0; i <= N; i++)
	    {
	        int count = 0;
	        for(int j = 1; j <= x; j++)
	            if(x%j == 0) {
	                count++;
	            }
	        if(count == 2) {
	            System.out.print(x + " ");
	        }
	        x++;
	    }
	}
}

