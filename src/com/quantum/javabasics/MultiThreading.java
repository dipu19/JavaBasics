package com.quantum.javabasics;
class Thread11 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hii");
		}
	}
}
class Thread22 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
		}
	}
}
public class MultiThreading {
	public static void main(String[] args) throws Exception
	{
		Thread11 t1=new Thread11();
		Thread22 t2=new Thread22();
		t1.start();
		t2.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Dipu");
		}
		t1.join();
		t2.join();
		
	}
}
