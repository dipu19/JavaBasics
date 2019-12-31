package com.quantum.javabasics;
//Example on Exception.
public class ExceptionHandling {
	
	public static void main(String[] args)
	{
		System.out.println("Before exception occours");
		System.out.println();
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled "+10/2);
			System.out.println();
		}
		System.out.println("Congrats program  worked");
	}
	
}
