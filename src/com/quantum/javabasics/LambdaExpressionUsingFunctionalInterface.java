package com.quantum.javabasics;

interface Interface
{
	public int m1();
}

public class LambdaExpressionUsingFunctionalInterface {

	public static void main(String[] args)
	{
		Interface i = ()->10;
		System.out.println(i.m1());
		
		Interface i1 = ()->10*20;
		System.out.println(i1.m1());
		
		Interface inter = ()->20/10;
		System.out.println(inter.m1());
	}
}
