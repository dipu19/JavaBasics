package com.quantum.javabasics;

import java.util.Scanner;

//Selection Sorting
public class SelectionSorting {
	public static void main (String[] args)
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
		 for (int i = 0 ;i< n-1; i++){
	          int min = i;

	         for (int j = i+1; j<n; j++){
	            if (arr[j] < arr[min]){
	            min = j;
	            }
	         }
	         int temp = arr[min];
	         arr[min] = arr[i];
	         arr[i] = temp;
	      }
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
 
	}
}
