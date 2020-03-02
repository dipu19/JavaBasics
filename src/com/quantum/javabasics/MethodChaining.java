package com.quantum.javabasics;

public class MethodChaining {

	public void test()
	{
		System.out.println("1");
		test(1);
		System.out.println("5");
	}
	public void test(int i)
	{
		System.out.println("2");
		test(10,20);
		System.out.println("4");
	}
	public void test(int i,int i2)
	{
		System.out.println("3");
	}
	public static void main(String[] args)
	{
		MethodChaining object=new MethodChaining();
		object.test();
	}
}
