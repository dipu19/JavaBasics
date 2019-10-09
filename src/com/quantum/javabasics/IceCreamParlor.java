package com.quantum.javabasics;
import java.util.*;
public class IceCreamParlor {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of cost array ");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println("Enter the total amount");
		int amount=sc.nextInt();
		System.out.println("Enter the value to array");
		int [] arr=new int[n];
		int a1=0;
		int a2=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==amount)
				{
					a1=i+1;
					a2=j+1;
				}
			}
		}System.out.println(a1+" "+a2);
	}
}
