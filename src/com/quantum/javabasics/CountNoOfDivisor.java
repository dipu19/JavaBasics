package com.quantum.javabasics;

import java.util.Scanner;

public class CountNoOfDivisor {
	public static void main (String[] args)
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		if(number<0)
		{
			System.out.println("please enter possitive integer ");
			
		}
		 if(number>0)
		{
			for(int i=1;i<100;i++)
			{
				if(number%i==0)
				{
					count++;
				}
			}
		}if(number>0)
		 System.out.println("no of divisor is "+count);
	}

	
}
