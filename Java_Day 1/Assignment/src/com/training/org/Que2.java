package com.training.org;
public class Que2 {
	public static int FirstRepeatingElement(int[] a, int len) {
		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] == a[j]) {
					temp = a[j];
					i = j;
					j = j + 1;
					j++;
				}
			}	
		}
		return temp;
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 6, 3, 2 };
		System.out.println("First Repeating Element is: " + FirstRepeatingElement(a, 7));
	}
}
