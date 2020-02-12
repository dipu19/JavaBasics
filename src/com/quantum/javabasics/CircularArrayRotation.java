package com.quantum.javabasics;

import java.util.Scanner;

public class CircularArrayRotation {
		
	public static void main(String[] args)
	
	{
		
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter values to array");
		int [] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int[] arr1=new int[a.length];
		arr1[arr1.length-1]=a[0];
		for(int i=0,j=1;i<arr1.length-1&j<a.length;i++,j++)
		{
			arr1[i]=a[j];;
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
}
}
