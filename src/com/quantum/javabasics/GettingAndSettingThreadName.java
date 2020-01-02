package com.quantum.javabasics;
class ThreadClass extends Thread
{
	public void run()
	{
		System.out.println("Dipu");
	}
}
public class GettingAndSettingThreadName {

	public static void main(String[] args)
	{
		
		System.out.println(Thread.currentThread().getName());
		System.out.println();
		ThreadClass t=new ThreadClass();
		t.start();
		System.out.println(t.getName());
		System.out.println();
		Thread.currentThread().setName("Sipu");
		System.out.println(Thread.currentThread().getName());
	}
}
