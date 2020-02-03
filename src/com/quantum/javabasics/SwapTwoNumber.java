package com.quantum.javabasics;

import java.util.Scanner;

public class SwapTwoNumber {

	public void swap(int x,int y)
	{
		int a=x;
		 x=y;
		y=a;
		System.out.println("the value of x is "+x);
		System.out.println("the value of y is "+y);
	}
	public static void main(String[] args)
	{
		System.out.println("enter the 1st number you want to swap");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter the 2nd number you want to swap");
		int y=sc.nextInt();
		SwapTwoNumber s=new SwapTwoNumber();
		s.swap(x, y);
	}
}
				
	