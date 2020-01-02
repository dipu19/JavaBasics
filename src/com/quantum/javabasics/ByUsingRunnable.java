package com.quantum.javabasics;
//By implementing runnable class.
class MyClass implements Runnable
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the name");
		}
	}
}
public class ByUsingRunnable {
	public static void main(String[] args)
	{
		MyClass m=new MyClass();
		Thread t=new Thread(m);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Dipu");
		}
	}
}
