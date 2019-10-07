package com.quantum.javabasics;
import java.util.*;
public class InsertionSortAdvance {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter element to array");
		int arr[]=new int[n];
		int sum=0;
		ArrayList <Integer>arr1=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0,j=1;i<n&j<n;i++,j++)
		{
				if(arr[i]>arr[j])
				{
					int no=arr[i];
					arr[i]=arr[j];
					arr[j]=arr[i];
					arr1.add(j);
					
				}
			
		}
		for(int i=0;i<arr1.size();i++)
		{
			sum=sum+arr1.get(i);
			System.out.println(arr1.get(i));
			
		}	System.out.println(sum);		
	}

}
