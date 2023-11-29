package com.training.org;

import java.io.*;
import java.util.Scanner;

public class Que4 {
	public static void main(String[] args) {
		int len;
		int Even = 0;
		int Odd = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Length of array: ");
		len = input.nextInt();
		int[] a = new int[len];

		System.out.print("Enter " + len + " elements of an Array: ");
		for (int i = 0; i < len; i++) {
			a[i] = input.nextInt();
		}
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				Even = Even + a[i];
			} else {
				Odd = Odd + a[i];
			}
		}
		System.out.println("Sum of Odd Numbers " + Odd);
		System.out.println("Sum of Even Numbers: " + Even);

	}
}
