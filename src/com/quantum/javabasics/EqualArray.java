package com.quantum.javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArray {
	
	public void equality(int[] arr1,int[] arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int length1=arr1.length;
		int length2=arr2.length;
		if(length1==length2)
		{int count=0;
		for(int i=0;i<length1;i++)
		{
			if(arr1[i]==arr2[i])
			{
				count++;
				continue;
			}
			else
			{
				System.out.println("Arrays are not same");
			}
		}
		if(count==length1)
		{
			System.out.println("Arrays are same");
		}
		}
		else
		{
			System.out.println("both arrays are not same");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int length1=sc.nextInt();
		System.out.println("Enter elements to array");
		int[] arr1=new int[length1];
		for(int i=0;i<length1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of 2nd array");
		int length2=sc.nextInt();
		System.out.println("Enter elements to 2nd array");
		int[] arr2=new int[length2];
		for(int i=0;i<length2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		EqualArray eq=new EqualArray();
		eq.equality(arr1, arr2);
	}
}
