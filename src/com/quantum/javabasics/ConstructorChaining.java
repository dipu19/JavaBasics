package com.quantum.javabasics;

public class ConstructorChaining {

	public ConstructorChaining ()
	{
		System.out.println("1");
		new ConstructorChaining(10);
		System.out.println("5");
	}
	public ConstructorChaining(int data)
	{
		System.out.println("2");
		new ConstructorChaining(10,20);
		System.out.println("4");
	}
	public ConstructorChaining(int data1,int data2)
	{
		System.out.println("3");
	}
	public static void main(String[] args)
	{
		ConstructorChaining obj=new ConstructorChaining();
	}
}
