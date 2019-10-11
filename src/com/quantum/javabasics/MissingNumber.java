package com.quantum.javabasics;
import java.util.*;
public class MissingNumber {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of original array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		
		System.out.println("Enter element to array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of present array");
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		System.out.println("Enter the value to present array");
		for(int i=0;i<n1;i++)
		{int count=0;
			arr1[i]=sc.nextInt();
			for(int j=0;j<n;j++)
			{
				if(arr1[i]==arr[j])
				{
					count++;
				}continue;
			}if(count==0)
			{
				System.out.println("Missing element is "+arr1[i]);
			}
		}
		
		
	}
}
