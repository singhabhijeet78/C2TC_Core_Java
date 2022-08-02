//Java program to display Fibonacci series

package com.tns.assingment1;


import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// declaring variables
		int n, a = 0, b = 0, sum = 1;

		// user input
		System.out.print("Enter the Number:");
		n = s.nextInt();

		System.out.print("Fibonacci Series of entered number are:");
		for (int i = 1; i <= n; i++) // display
		{
			a = b;
			b = sum;
			sum = a + b;
			System.out.print(a + " ");
		}

	}

}