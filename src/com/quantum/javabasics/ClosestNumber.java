package com.quantum.javabasics;
import java.util.*;

public class ClosestNumber {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter element to array");
		int[] arr=new int[n];
		ArrayList<Integer> arr1=new ArrayList<Integer>(20);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0,j=1;i<n&j<n;i++,j++)
		{
			
				if(arr[j]-arr[i]==1)
				{
					arr1.add(arr[i]);
					arr1.add(arr[j]);
				}
			
		}System.out.println(arr1.size());
	}
}
