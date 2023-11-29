package com.training.org;

public class Que1 {
	public static int getSecondLargest(int[] a, int len) {
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[len - 2];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		System.out.println("Second Largest: " + getSecondLargest(a, 6));
	}
}