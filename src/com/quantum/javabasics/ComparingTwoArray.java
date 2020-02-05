package com.quantum.javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class ComparingTwoArray {
	public void compare(int[] a,int[] b)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}if(count==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the length of the array");
		Scanner sc=new Scanner(System.in);
		int l1=sc.nextInt();
		int[] a=new int[l1];
		System.out.println("Enter the length ofsecond array");
		int l2=sc.nextInt();
		int[] b=new int[l2];
		System.out.println("Enter element to 1st array");
		for(int i=0;i<l1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to 2nd array");
		for(int i=0;i<l2;i++)
		{
			b[i]=sc.nextInt();
		}
		ComparingTwoArray ct=new ComparingTwoArray();
		ct.compare(a,b);
		
	}
}
