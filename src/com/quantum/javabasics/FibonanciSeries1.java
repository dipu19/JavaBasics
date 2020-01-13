package com.quantum.javabasics;

public class FibonanciSeries1 {

	public int fib(int x)
	{
		int i=0;
		int n=-1;
		int n1=1;
		int result=0;
		while(i<x)
		{
			result=n+n1;
			n=n1;
			n1=result;
			i++;
		}return result;
	}
	public static void main(String[] args)
	{
		FibonanciSeries1 fb=new FibonanciSeries1();
		System.out.println(fb.fib(11));
	}
}
