package com.quantum.javabasics;

import java.util.Scanner;

public class RotationOfArrayElementToLeft {
//rotation of array by d element.
	public void leftRotate(int[] arr,int d)
	{
		for(int i=0;i<d;i++)
		{
			int a=arr[0];
			for(int j=0;j<arr.length;j++)
			{
				
				int k=j+1;
				if(k<arr.length)
				{
					arr[j]=arr[k];
				}
				
			}arr[arr.length-1]=a;
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
	public static void main(String[] args)
	{
		RotationOfArrayElementToLeft roab=new RotationOfArrayElementToLeft();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter elements to array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value till you want to rotate");
		int d=sc.nextInt();
		roab.leftRotate(arr, d);
	}
	
}
