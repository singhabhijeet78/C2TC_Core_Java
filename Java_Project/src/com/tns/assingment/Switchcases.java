package com.tns.assingment;

public class Switchcases {
	public static void main(String[] args) 
	{
		/*
		int x = 10;
		
		  if (x == 1) 
		  { 
			  System.out.println("The value of x is 1");
	      } 
		  else if 
		  (x== 2) 
		  {
			  System.out.println("The value of x is 2"); 
		  } 
		  
		  else if (x == 3)
		  { 
			  System.out.println("The value of x is 3"); 
		  } 
		  else 
		  {
		      System.out.println("The value of x is other than 1,2,3"); 
		  }
		 
		
		switch (x) 
		{
		case 1: 
			System.out.println("The value of x is 1");
			break;
		case 2:
			System.out.println("The value of x is 2");
			break;
		case 3:
			System.out.println("The value of x is 3");
			break;
		default:
		System.out.println("The value of x is other than 1,2,3");
			break;
		}
	} */

		//Switch cases---CHAR
		/* 
		{
			char x = 'F';
			switch (x) 
			{
			case 'a' : 
			case 'A' : 
				System.out.println("The value of x is a");
				break;
			case 'b':
			case 'B' :
				System.out.println("The value of x is b");
				break;
			case 'c':
			case 'C' :	
				System.out.println("The value of x is c");
				break;
			default:
		System.out.println("The value of x is other than a,b,c");
				break;
			}
		} */
		
		
		// Switch cases---STRING
		{
			String name = "te";

			switch (name.toLowerCase()) 
			{
			case "author":
				System.out.println("Vikas");
				break;
			case "team":
				System.out.println("Team Java Full Stack");
				break;
			case "editor":
				System.out.println("Vishnu & Krishna");
				break;
			default:
				System.out.println("Invalid entry");
				break;
		}
	}
	}

}
