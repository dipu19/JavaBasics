package com.quantum.javabasics;

public class FactorialNumber {

	public int fact(int x)
	{
		int i=1;
		int res=x;
		while(i<x)
		{
			res=res*(x-i);
			i++;
		}return res;
	}
	public static void main(String[] args)
	{
		FactorialNumber fn=new FactorialNumber();
		System.out.println(fn.fact(2));
	}
	
}
