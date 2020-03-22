package com.quantum.javabasics;

public class RecursionFunction {

	public void  fun(int n)
	{
		System.out.println(n);
		if(n==0)
			return;
		fun(n-1);
		System.out.println(n);
		
	}
	public static void main(String[] args)
	{
		RecursionFunction object = new RecursionFunction();
		object.fun(3);
	}
}
