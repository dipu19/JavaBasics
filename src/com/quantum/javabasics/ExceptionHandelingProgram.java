package com.quantum.javabasics;

public class ExceptionHandelingProgram {

	public int  divide(int a,int b)
	{
		try {
			int c=a/b;
			return c;
		}
		
		  catch(Exception e) { return 10; }
		 
		finally
		{
			System.out.println("i am in finally block");
		}
	}
	public static void main(String[] args)
	{
		ExceptionHandelingProgram object = new ExceptionHandelingProgram();
		System.out.println(object.divide(10, 0));
	}
}
