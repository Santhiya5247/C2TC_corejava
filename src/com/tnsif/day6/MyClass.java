package com.tnsif.day6;

public class MyClass 
{
	private  int section; //Non- static or Instance Variable
	private static int srNo; //Static variable or class variable
	
	
	//static block
	static
	{
		System.out.println("Within Static Block");
		
		srNo=1000; // Initialization
		
	}
	//Default constructor
	MyClass()
	{
		System.out.println("Within Default Constructor");
		srNo++;//srNo =srNo+1
		section++;//section=section+1
	}
	@Override
	public String toString() {
		return "MyClass [Serial No=" + srNo + "Section=" + section + "]";
	}
	
	//Static Method
	static void display()
	{
		//Can't make a static reference to the non static field.
		//System.out.println("Section :"+section);
		
		System.out.println("Serial No: "+srNo);
	}
	
}
