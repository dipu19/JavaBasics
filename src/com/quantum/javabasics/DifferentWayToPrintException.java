package com.quantum.javabasics;

public class DifferentWayToPrintException {
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int c=2;
		try
		{
			//System.out.println(a/c);
			System.out.println(a/b);
		}
		catch(NullPointerException e)
		{
			System.out.println("result ="+(10/5));
		}
		catch(ArithmeticException d)
		{
			System.out.println("result ="+(10/1));
	       //System.out.println(d.printStackTrace());
	        System.out.println(d.toString());
	      // System.out.println( d.getMessage());
		}
	}
}
