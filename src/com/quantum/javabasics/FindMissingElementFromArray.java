package com.quantum.javabasics;

import java.util.Scanner;

public class FindMissingElementFromArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n = sc.nextInt();
		int[] arr= new int[n-1];
		
		for(int i=0;i<n-1;i++)
		{
			System.out.println("Enter element to array");
			arr[i]= sc.nextInt();
		}
		int sum=n*(n+1)/2;
		int sum1 = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum1 = sum1+arr[i];
			
		}
		System.out.println("Missing number is "+(sum-sum1));
		
	}
}
