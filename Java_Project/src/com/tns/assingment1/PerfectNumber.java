//Check for a Perfect number in java

package com.tns.assingment1;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);

		// user input
		System.out.print("Enter the number: ");
		n = sc.nextInt();

		int i = 1;

		while (i <= n / 2) {
			if (n % i == 0)
				sum = sum + i;
			i++;
		}

		// comparing and displaying the perfect number
		if (sum == n)
			System.out.println(n + " is a perfect number.");
		else
			System.out.println(n + " is not a perfect number.");
	}

}