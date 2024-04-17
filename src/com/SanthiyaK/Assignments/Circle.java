package com.SanthiyaK.Assignments;

import java.util.Scanner;

public class Circle {
	Scanner s=new Scanner(System.in);
	float Radius;
	String Colour;
	void getInput()
	{
		System.out.println("Enter a Radius:");
		Radius=s.nextFloat();
		System.out.println("Enter a Colour:");
		Colour=s.next();
	}
	double calcArea()
	{
		double area=3.14*Radius*Radius;
		return area;
	}
	public static void main(String[] args)
	{
		Circle c1=new Circle();
		c1.getInput();
		double Area=c1.calcArea();
		System.out.println("Area of the Circle:"+Area);

	}

}