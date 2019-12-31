package com.quantum.javabasics;
//Using of finally block with try-catch.
public class UsingOfFinallyBlock {
	//finally block use for clean up purpose.
	public static void main(String[] args)
	{
		System.out.println("Hello Dipu");
		try {
			System.out.println(10/0);
		}
		
		  catch(ArithmeticException e) { System.out.println("Exception found "+10/2); }
		 
		finally
		{
			System.out.println("Program compiled sucessfully");
		}
	}
}
