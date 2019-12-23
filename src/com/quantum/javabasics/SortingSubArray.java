package com.quantum.javabasics;
//Sorting elements of sub array

import java.util.Arrays;
import java.util.Scanner;

public class SortingSubArray {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter element to array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr,1,4);
		System.out.println(Arrays.toString(arr));
	}
}
