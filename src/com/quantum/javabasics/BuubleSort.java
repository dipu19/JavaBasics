package com.quantum.javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class BuubleSort {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter elements to array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//comparing two adjacent element in bublle sort
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}System.out.println(Arrays.toString(arr));
	}
}
