package com.quantum.javabasics;

class CustomizedThread extends Thread
{
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am waiting..");
		}
		
	  Thread.yield();// it will give chance to other thread to complete first and then current thread will execute.
	
	}
}

public class JoinInThread {

	public static void main(String[] args) throws InterruptedException
	{
		CustomizedThread thread = new CustomizedThread();
		
		thread.start();// thread priority is same with other thread
		
		//thread.join();// it will wait for to complete first thread and then other thread will execute.
		for(int i=0;i<10;i++)
		{
			System.out.println("For you..");
		}
		
		
	}
}
