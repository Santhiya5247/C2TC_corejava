package com.SanthiyaK.Assignments;


import java.util.Scanner;

public class Commission 
{
	String name;
	String Address;
	String Commission;
	long Phone;
	long SalesAmount;
public void getEmployeeDetails()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Your Name:");
			name=s.nextLine();
			System.out.println("Enter Your Address:");
			Address=s.nextLine();
			System.out.println("Enter Your Phone Number:");
			Phone=s.nextLong();
			System.out.println("Enter Your SalesAmount:");
			SalesAmount=s.nextLong();
		}
public void CalCommission()
{
	if(SalesAmount>=100000)
	{
		System.out.println("Your Commission Amount is:10%");
	}
	else if(50000<=SalesAmount && SalesAmount<100000)
	{
		System.out.println("Your Commission Amount is:5%");
	}
	else if(3000<=SalesAmount && SalesAmount<50000)
	{
		System.out.println("Your Commission Amount is:3%");
	}
	else
	{
		System.out.println("Your Commission Amount is:0%");
	}
}

public static void main(String args[]){
	Commission c= new Commission();
	c.getEmployeeDetails();
	c.CalCommission();
}
}