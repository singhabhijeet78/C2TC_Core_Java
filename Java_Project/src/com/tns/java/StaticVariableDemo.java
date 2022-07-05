package com.tns.java;
//static variable concept


public class StaticVariableDemo 

{	
	String name;//object bound
	int roll;//object bound
	static String coll="Manav Rachna International University"; //class bound
	
	
	void display()
	
	{
		System.out.println(name+" "+roll+" "+coll);
	}

	
	public StaticVariableDemo(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public static void main(String[] args)
	{
		StaticVariableDemo s1=new StaticVariableDemo("Abhijeet",1);
		
		StaticVariableDemo s2=new StaticVariableDemo("Sujay",2);
		s1.display();
		s2.display();
	}

}
	
