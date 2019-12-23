package com.quantum.javabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//A simple sorting program 
//Sorting element in descending order
public class Sorting {
	public static void main(String[] args)
	{ 	
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter element to array");
		Integer[] arr=new Integer[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	    Arrays.sort(arr,Collections.reverseOrder());
	    System.out.println("Modified array element:"+Arrays.toString(arr));
	}

}
