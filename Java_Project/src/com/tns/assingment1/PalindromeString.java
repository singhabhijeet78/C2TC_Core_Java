package com.tns.assingment1;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String str1, str2 = "";
		Scanner sc = new Scanner(System.in);

		// user input
		System.out.print("Enter the String: ");
		str1 = sc.nextLine();

		for (int i = str1.length() - 1; i >= 0; i--)
			str2 += str1.charAt(i);

		// equalsIgnoreCase = This method returns true if the argument is not null and
		// it represents an equivalent String ignoring case, else false
		
		if (str1.equalsIgnoreCase(str2))
			System.out.println("The entered string is palindrome.");
		
		else
			System.out.println("The entered  string is not palindrome.");

	}

}