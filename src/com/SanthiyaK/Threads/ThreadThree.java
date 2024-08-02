package com.SanthiyaK.Threads;
class MyThread extends Thread
{
	public void run()
	{    
		int i;
		System.out.println("Inside the run method:"+this.isAlive());
		for(i=0;i<=4;i++)
		{
		 System.out.println(i);
		 System.out.println("Inside the run method:"+this.isAlive());
		 try
		 {
			 Thread.sleep(400);
			
		 }
		 catch(InterruptedException e) 
		 {
			 System.out.println(e);
		 }
		}
	}
}


public class ThreadThree
{
 public static void main(String[] args)	
 {
	MyThread to = new MyThread ();
	System.out.println("Inside the main method:"+to.isAlive());
	to.start();
	try
	{
		Thread.sleep(5000);
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
		
	}
	System.out.println("After Execution:"+to.isAlive());
 }
}
