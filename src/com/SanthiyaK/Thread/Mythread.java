package com.SanthiyaK.Thread;
class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("Thread Name:"+ThreadDemo.currentThread().getName());
		System.out.println("Thread Priority:"+ThreadDemo.currentThread().getPriority());
		
	}
}

public class Mythread 
{
 public static void main(String[] args)
 {
	 System.out.println("Current Thread Details:"+Thread.currentThread());
	 ThreadDemo td=new ThreadDemo();
	 td.start();
	 td.setPriority(7);
	 td.setName("JP");
	 }
}
