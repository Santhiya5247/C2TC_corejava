package com.SanthiyaK.Thread;
class ThreadTest extends Thread
{
	int i ;
	{
	for(i=0;i<=8;i++)
	{
		System.out.println(i);
	}
}
}
public class ThreadOne
{
public static void main(String[] args)
{
	ThreadTest tt=new ThreadTest();
	tt.start();
}
}
