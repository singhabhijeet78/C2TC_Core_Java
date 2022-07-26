package com.tns.java;

public class Wrapper {

	public static void main(String[] args)
	{
		Boolean b=new Boolean("YES");
		Boolean c=new Boolean("NO");
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(b.equals(c));

		//Float l=new Float(7.777);
		//System.out.println(l);
		
		//ArrayList l=new ArrayList();
		//Integer i=new Integer(10);//Automatic Boxing 
		//l.add(i);
		//System.out.println(l);
		}
}
