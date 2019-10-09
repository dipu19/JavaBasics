package com.quantum.javabasics;
import java.util.*;
public class Min_Diff {
public static void main(String[] args)
{
	System.out.println("Enter the size of array");
	Scanner sc =new Scanner (System.in);
	int n=sc.nextInt();
	System.out.println("Enter element to array");
	int []arr =new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	ArrayList min=new ArrayList(n);
	
	for(int i=0;i<n;i++)
	{
		for(int j=1;j<n;j++)
		{
			if(arr[i]!=arr[j])
			{
				min.add(Math.abs(arr[i]-arr[j]));
				
			}
		}
	}
     Collections.sort(min);
	System.out.println(min.get(0));
	
}
}
