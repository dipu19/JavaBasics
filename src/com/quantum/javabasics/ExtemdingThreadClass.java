package com.quantum.javabasics;
class Test1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello Dipu");
		}
	}
}
public class ExtemdingThreadClass {
	public static void main(String[] args)
	{
		Test1 t=new Test1();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Hii brother");
		}
	}
	
}
