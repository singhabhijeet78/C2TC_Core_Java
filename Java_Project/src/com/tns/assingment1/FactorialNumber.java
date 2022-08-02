//Java Program to Find a Factorial of a Number

package com.tns.assingment1;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);

		// user input
		System.out.print("Enter the number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++)
			fact = fact * i;

		System.out.println("Factorial of entered number is: " + fact);

	}

}