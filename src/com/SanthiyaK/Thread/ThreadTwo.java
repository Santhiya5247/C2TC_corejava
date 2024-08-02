package com.SanthiyaK.Thread;
class add implements Runnable
{
	public void run()
	{
		int a=10,b=20,c;
		c=a+b;
		
		{
		System.out.println(c);
		
		}		
	}
}
class num implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=5;i++)
		{
		System.out.println(i);
		
		}		
	}
}

public class ThreadTwo
{
	public static void main(String[] args)
	{
		add a = new add();
		num n = new num();
		Thread t= new Thread(n);
		Thread t1=new Thread(a);
	    //t.start();
		t.run();
		t1.run();
	}
}
