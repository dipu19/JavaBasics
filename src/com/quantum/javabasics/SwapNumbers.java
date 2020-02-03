package com.quantum.javabasics;

import java.util.Scanner;

public class SwapNumbers {

	public void swap(int x,int y) throws Exception
	{
		System.out.println("the value of x is "+((x+y)-x));
		Thread.sleep(1200);
		System.out.println("The value of y is "+((x+y)-y));
	}
	public static void main(String[] args) throws Exception
	{
		System.out.println("enter the value of x");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("enter the value of y");
		int y=sc.nextInt();
		SwapNumbers s=new SwapNumbers();
		s.swap(x, y);
		
	}
}
