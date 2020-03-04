package com.quantum.javabasics;

import java.util.Scanner;

public class CountNoOfRotation {

	public void rotate(int[] arr)
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==min)
			{
				System.out.println("Number of rotations of array is "+i);
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		CountNoOfRotation object=new CountNoOfRotation();
		System.out.println("Enter elements to array");
		int[] array=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		object.rotate(array);
	}
}
