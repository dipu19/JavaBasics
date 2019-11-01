package com.quantum.javabasics;
import java.util.*;
public class CountingSorting2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter  values to array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		 int count[] = new int[100];

		    for (int i = 0; i < 100; i++){
		        count[i] = 0;
		    }

		    for (int i = 0; i < arr.length; i++){
		        count[arr[i]] = count[arr[i]] + 1;
		    }

		    for(int i=0;i<count.length;i++)
		    {
		    	System.out.println(count[i]);
		    }
		
	}
}
