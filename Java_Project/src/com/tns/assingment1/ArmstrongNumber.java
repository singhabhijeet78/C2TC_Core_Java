//Check for an Armstrong Number In JAVA;

package com.tns.assingment1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// declaring variables
		int n, num, totalDigits, remainder, result = 0;

		System.out.println("Enter the Number:");

		n = scanner.nextInt();
		scanner.close();

		// setting the power to the no. of digits
		totalDigits = String.valueOf(n).length();

		num = n;

		while (num != 0) {
			remainder = num % 10;
			int lastDigits = 1;

			for (int i = 0; i < totalDigits; i++) {
				lastDigits = lastDigits * remainder;
			}

			result = result + lastDigits;
			num /= 10;
		}

		if (result == n)
			System.out.println(n + " is an Armstrong number.");
		else
			System.out.println(n + " is not an Armstrong number.");

	}

}