package com.quantum.javabasics;
 import java.util.*;
public class MyProject {

	public static void main(String[] args)
	{
		//adding value 0,1,2 to an array.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter values to array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] result=new int[size];
		int count0=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==0)
			{
				count0++;
			}
			if(arr[i]==1)
			{
				count1++;
				
			}
			if(arr[i]==2)
			{
				count2++;
			}
		}
		for(int i=0;i<count0;i++)
		{
			result[i]=0;
			
		}
		for(int i=count0;i<count1+count0;i++)
		{
			result[i]=1;
			
		}for(int i=count0+count1;i<result.length;i++)
		{
			result[i]=2;
			
		}
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
	}
}
