package com.quantum.javabasics;
import java.util.*;
public class NoOfPairs {
public static void main(String[] args)
{
	System.out.println("Enter the array size");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	System.out.println("Enter element to array");
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	Arrays.sort(arr);
	for(int i=0,j=1;i<n&j<n;i++,j++)
	{
		if(arr[j]-arr[i]==1)
		{
			count++;
		}
	}System.out.println("No of pair = "+count);
}
}
