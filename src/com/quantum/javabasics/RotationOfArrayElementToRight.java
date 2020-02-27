package com.quantum.javabasics;

import java.util.Scanner;

public class RotationOfArrayElementToRight {

	public void rotateElement(int[] arr,int d)
	{
		for(int i=0;i<d;i++)
		{
			int a=arr[arr.length-1];
			for(int j=arr.length-1;j>=1;j--)
			{
				arr[j]=arr[j-1];
			}arr[0]=a;
			
		}
		
		  for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter values to array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value till you want to move");
		int d=sc.nextInt();
		RotationOfArrayElementToRight obj=new RotationOfArrayElementToRight();
		obj.rotateElement(arr, d);
	}
}
