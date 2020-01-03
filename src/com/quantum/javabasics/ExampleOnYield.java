package com.quantum.javabasics;
class Left extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Hii");
		}
		Thread.yield();
	}
}
public class ExampleOnYield {
	public static void main(String[] args)
	{
	    Thread.currentThread().setPriority(2);
	    System.out.println(Thread.currentThread().getPriority());
		Left l=new Left();
		l.start();
		l.setPriority(2);
		System.out.println(l.getPriority());
		for(int i=0;i<4;i++)
		{
			System.out.println("Hello");
		}
		
		
	}
}
