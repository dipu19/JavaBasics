package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumber {

	public void closestNumber(int[] arr)
	{
		
	    ArrayList <Integer>ar= new ArrayList<Integer>();
	    Arrays.sort(arr);
	   
	   
	    int minDif=arr[arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			if(Math.abs(arr[i]-arr[i-1])<=Math.abs(minDif))
			{
				minDif = Math.abs(arr[i]-arr[i-1]);
			}
			
		}
		for(int i=1;i<arr.length;i++)
		{
			if(Math.abs(arr[i]-arr[i-1])<=Math.abs(minDif))
			{
				ar.add(arr[i-1]);
				ar.add(arr[i]);
			}
			
		}
		 int[] arr1 = new int[ar.size()];
		
		for(int i=0;i<ar.size();i++)
		{
			
			arr1[i] = ar.get(i);
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
	public static void main(String[] args)
	{
		ClosestNumber object1 = new ClosestNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("Enter elements to array");
		int[] arr =new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		object1.closestNumber(arr);
	}
}
