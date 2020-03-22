package com.quantum.javabasics;

import java.util.Scanner;

public class BubbleSort {

	public void bubbleSort(int[] arr)
	{
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int key = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = key;
				}
			}
		}
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{

		BubbleSort bs = new BubbleSort();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		System.out.println("Enter elements to array");
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		bs.bubbleSort(arr);
	}
}
