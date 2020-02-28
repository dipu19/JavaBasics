package com.quantum.javabasics;

import java.util.Scanner;

public class CyclicRotateArray {

	public void insert(int[] arr,int d)
	{
		
			
		for(int j=0;j<d;j++)
		{
		int x = arr[arr.length-1]; 
	       for (int i = arr.length-1; i > 0; i--) 
	          arr[i] = arr[i-1]; 
	       arr[0] = x;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static void main(String[] args)
	{
		CyclicRotateArray object=new CyclicRotateArray();
		System.out.println("Enter the size of integer array");
		Scanner sc=new Scanner(System.in);
		int arraySize=sc.nextInt();
		System.out.println("Enter elements to array");
		int[] arr=new int[arraySize];
		for(int i=0;i<arraySize;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value you want to rotate");
		int d=sc.nextInt();
		object.insert(arr,d);
		
	}
}
