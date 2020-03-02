package com.quantum.javabasics;

import java.util.Scanner;

public class FindMaximumSumOfRotationArray {

	public void max(int[] arr)
	{
		int max=0;
		int i1=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				i1=i;
			}
		}

		 for(int i = 0; i <arr.length-(i1+1); i++){    
	            int j, last;    
	               
	            last = arr[arr.length-1];    
	            
	            for(j = arr.length-1; j > 0; j--){    
	                arr[j] = arr[j-1];    
	            }    
	             
	            arr[0] = last;    
	        } 
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+(i*arr[i]);
		}
		System.out.println("maximum sum is "+sum);
		
		
	}
	public static void main(String[] args)
	{
		FindMaximumSumOfRotationArray object=new FindMaximumSumOfRotationArray();
		System.out.println("Enter the array length");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter elements to array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		object.max(arr);
		
	}
}
