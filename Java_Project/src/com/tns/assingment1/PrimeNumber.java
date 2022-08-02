//java program to check for Prime Number

package com.tns.assingment1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// variables
		int number;
		boolean isPrime = true;

		Scanner sc = new Scanner(System.in); // scanner class

		// user inputs
		System.out.print("Enter a number: ");
		number = sc.nextInt();

		// looping
		for (int i = 2; i < number / 2; i++)
			if (number % i == 0)
				isPrime = false;

		// checking condition
		if (isPrime == true)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");

	}

}