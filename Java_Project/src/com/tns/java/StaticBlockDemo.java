package com.tns.java;

//static block usage
public class StaticBlockDemo {

	public static void main(String[] args)// main block
		{
			System.out.println(10+20);

		}	
	static void m()//static method 
	{
		System.out.println("Demo");
	}
	static         //static blocks
	{
		System.out.println(80+20);
		m();
	}
	
	static
	{
		System.out.println(70+10);
	}
	
	static
	{
		System.out.println(10);
	}
}
