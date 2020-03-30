package com.quantum.javabasics;

public class BinaryProblem {

	public void conversion(long number)
	{
		long max = (long)Math.pow(2, 32)-1;
		System.out.println(max);
		System.out.println(number^max);
	}
	public static void main(String[] args)
	{
		BinaryProblem object = new BinaryProblem();
		object.conversion(8);
		
	}
}
