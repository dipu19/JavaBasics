package com.quantum.javabasics;

import java.util.Scanner;

public class InsertionSortOfArray {

	public void sort(int [] a)
	{
		int length=a.length;
		for(int i=1;i<length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(a[j]>=key&&j>=0)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		for (int i=0;i<length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args)
	{
		InsertionSortOfArray isa=new InsertionSortOfArray();
		System.out.println("Enter the length of array");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		System.out.println("Enter the values to array");
		int[] arr=new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		isa.sort(arr);
	}
}
