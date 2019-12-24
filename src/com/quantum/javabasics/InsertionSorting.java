package com.quantum.javabasics;

import java.util.Scanner;

//Insertion Sorting
public class InsertionSorting {
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
		for(int i=1;i<n;i++)
		{
			   int temp = arr[i];  
		        int j= i-1;  
		        while(j>=0 && temp <= arr[j])  
		        {  
		            arr[j+1] = arr[j];   
		            j = j-1;  
		        }  
		        arr[j+1] = temp;  
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}
}
