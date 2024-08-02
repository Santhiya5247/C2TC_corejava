package com.SanthiyaK.LambdaExpression;

public class LambdaExpWidParameter
{
public static void main(String[] args)
{
	Message m1=(name)->{
		System.out.println("Hello"+name);
		};
		m1.greet("Santhiya");
}
}
