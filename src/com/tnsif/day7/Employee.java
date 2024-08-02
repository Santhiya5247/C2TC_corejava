package com.tnsif.day7;

public class Employee 
{
	//declare  the  instance variable
	private String name;
	private  int id;
	
	//declare  a static  variable companyName  
	static String companyName="TNSIF";

	//parameterized constructor
	
	public Employee(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ",Company= "+companyName +"]";
	}
	
		
	
		
}

