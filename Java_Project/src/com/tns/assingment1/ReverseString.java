//Java Program to Reverse a String

package com.tns.assingment1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str, revString = "";
		Scanner in = new Scanner(System.in);

		// user input
		System.out.println("Enter a string: ");
		str = in.nextLine();

		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			revString += str.charAt(i);
		}

		// display the reverse result
		System.out.println("Reverse of the entered string: " + revString);

	}

}