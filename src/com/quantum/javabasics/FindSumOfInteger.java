package com.quantum.javabasics;

import java.util.Scanner;

public class FindSumOfInteger {

	public void sum(int number)
	{
		int sum=0;
		while(number!=0)
		{
			int i=number%10;
			sum=sum+i;
			number=number/10;
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		FindSumOfInteger fs=new FindSumOfInteger();
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fs.sum(n);
	
	}
}
