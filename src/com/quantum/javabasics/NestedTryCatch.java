package com.quantum.javabasics;

public class NestedTryCatch {
	
	public static void main(String[] args)
	{
		System.out.println("Hi ");
		try {
			try {
			System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("nested try");
			}
			System.out.println(15/3);
		}
		catch(Exception e)
		{
			System.out.println(12/2);
		}
	}
}
