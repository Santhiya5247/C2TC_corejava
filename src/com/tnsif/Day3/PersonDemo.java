package com.tnsif.Day3;
import java.util.Scanner;

public class PersonDemo 
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		String name;
		System.out.println("Enter the  name:");
		name=s.next();
		int income;
		System.out.println("Enter the income:");
		income=s.nextInt();
		int age;
		System.out.println("Enter the age:");
		age=s.nextInt();
		
		//Person object and initialize values using setter
		Person  person = new  Person();
		person.setName(name);
		person.setIncome(income);
		person.setAge(age);
		
		//Display
		System.out.println(person);

	}

}

