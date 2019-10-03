package com.quantum.javabasics;
import java.util.*;
public class SortingProgram {
	public static void main(String[] args)
	{
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the value into array ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr1=new int[n];
		int n1=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			if(arr[i]<arr[j])
			{
				n1=arr[j];
				arr[j]=arr[i];
					/*
					 * for(int k=0;k<n;k++) { System.out.println(arr[i]); }
					 */
				arr[i]=n1;
			}
		}for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
  
}
