package com.quantum.javabasics;

public class IndirectMethodRecursion {

	public int  method1(int number)
	{
		if(number ==0)
		{
			return 0;
		}
		else
			
		{
			
			return method2(number);
		}
	}
	public int  method2(int number)
	{
		number = number-1;
		
		return method1(number);
	}
	public static void main(String[] args)
	{
		IndirectMethodRecursion object = new IndirectMethodRecursion();
		System.out.println(object.method1(4));
	}
}
