package com.quantum.javabasics;

public class FactorialOfNumber {
	public static void main(String[] arg)
	{   
		int number=6;
		long factorial=1;
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
			
		}System.out.println(factorial);
	}
}
