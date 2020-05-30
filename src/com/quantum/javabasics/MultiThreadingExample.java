package com.quantum.javabasics;

class FirstThread extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("In First Thread");
		}
	}
}

class SecondThread extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("In Second Thread");
		}
	}
}


public class MultiThreadingExample {

	public static void main(String[] args) throws InterruptedException
	{
		FirstThread thread1=new FirstThread();
		SecondThread thread2=new SecondThread();
		thread1.start();
		
		thread2.start();
		
		
		
		System.out.println("In Main Thread");
	}
	
}
