package com.tns.assingment;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 7;
		boolean isPrime = true;
		
		//looping
		for(int i = 2; i < number/2; i++)
			if(number % i == 0)
				isPrime = false;
		
		if(isPrime == true) System.out.println("It is a prime number");
		
		else System.out.println("It is not a prime number");
		

	}

}
