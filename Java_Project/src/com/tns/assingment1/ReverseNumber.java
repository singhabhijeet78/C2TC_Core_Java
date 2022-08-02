//Java Program to Reverse the Number

package com.tns.assingment1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n, rev = 0;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter an integer to reverse: ");
		n = in.nextInt();

		while (n != 0) {
			rev = rev * 10;
			rev = rev + n % 10;
			n = n / 10;
		}

		System.out.println("Reverse of the entered interger is " + rev);

	}

}