//Java Program to find the Duplicate Characters in a String

package com.tns.assingment1;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String str;
		int num = 0;
		Scanner sc = new Scanner(System.in);

		// Get input String
		System.out.println("Enter a string: ");
		str = sc.nextLine();

		// converting the string to character array
		char[] chars = str.toCharArray();

		System.out.println("Duplicate characters are:");

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (chars[i] == chars[j]) {
					System.out.println(chars[j]);
					num++;
					break;
				}
			}
		}

	}

}