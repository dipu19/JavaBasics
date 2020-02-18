package com.quantum.javabasics;

import java.util.Scanner;

//largest number less than that number without the given number
public class LargestNumber {

	public void large(int number,int digit)
	{
		int count=0;
		int number1=number;
		
		while(number!=0)
		{
			number=number/10;
			count++;
		}int[] arr=new int[count];
		for(int i=count-1;i>=0;i--)
		{
			arr[i]=number1%10;
			number1=number1/10;
		}
		for(int i=0;i<count;i++)
		{
			if(arr[i]==digit)
			{
				arr[i]=digit-1;
				for(int j=i+1;j<count;j++)
				{
					arr[j]=9;
				}
			}
			
		}for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("Enter digit");
		int digit=sc.nextInt();
		LargestNumber ls=new LargestNumber();
		ls.large(number, digit);
	}
}
