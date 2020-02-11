package com.quantum.javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestNumber {
	//largest number
	public void large(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println("Largest element of array is "+arr[arr.length-1]);
	}
	//smallest number
	public void small(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println("Smallest element of array is "+arr[0]);
	}
	public static void main(String[] args)
	{
		LargestAndSmallestNumber obj=new LargestAndSmallestNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements to array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		obj.large(arr);
		System.out.println();
		obj.small(arr);
	}
}
