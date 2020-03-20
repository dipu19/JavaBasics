package com.quantum.javabasics;

import java.util.Scanner;

public class SelectionSort {

	public void sort(int[] arr)
	{
		int length = arr.length;
		
		 for (int i = 0; i < length-1; i++) 
	        { 
	            int min_idx = i; 
	            for (int j = i+1; j < length; j++) 
	                if (arr[j] < arr[min_idx]) 
	                    min_idx = j; 
	  
	            int temp = arr[min_idx]; 
	            arr[min_idx] = arr[i]; 
	            arr[i] = temp; 
	        } 
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("Enter lements to array");
		int [] arr= new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		SelectionSort object = new SelectionSort();
		object.sort(arr);
	}
}
