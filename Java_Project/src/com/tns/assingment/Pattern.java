package com.tns.assingment;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//User Input
		System.out.print("Enter any Character: ");
        char ch = sc.next().charAt(0);
        
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        
		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.print(ch);
			
			System.out.println();
		}
	}

}
