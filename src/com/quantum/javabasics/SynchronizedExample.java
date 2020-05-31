package com.quantum.javabasics;

class CustomizedThreadExample extends Thread
{
	public synchronized void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("I am here.. "+Thread.currentThread().getName());
		}
	}
}


public class SynchronizedExample {

	public static void main(String[] args)
	{
		CustomizedThreadExample thread1 = new CustomizedThreadExample();
		CustomizedThreadExample thread2 = new CustomizedThreadExample();
		
		thread1.start();
		thread2.start();
	}
	
}
