//Java Program to check whether the Number is Palindrome or not

package com.tns.assingment1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n, rev = 0, remainder, originalNumber;

		Scanner sc = new Scanner(System.in);

		// user input
		System.out.print("Enter an integer: ");
		n = sc.nextInt();

		originalNumber = n;

		// reversing
		while (n != 0) {
			remainder = n % 10;
			rev = rev * 10 + remainder;
			n /= 10;
		}

		// Displaying
		if (originalNumber == rev)
			System.out.println(originalNumber + " is a palindrome.");
		else
			System.out.println(originalNumber + " is not a palindrome.");

	}

}