package com.quantum.javabasics;
import java.util.*;
public class PriyankaAndToys {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter value to array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}Arrays.sort(arr);
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(arr[i]-arr[j])>4)
				{
					count++;
					i=j;
				}
			}
		}System.out.println(count+1);
	}
}
