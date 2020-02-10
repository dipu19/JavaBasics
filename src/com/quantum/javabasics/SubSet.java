package com.quantum.javabasics;

import java.util.HashSet;
import java.util.Scanner;

public class SubSet {

	public void find(int[] a,int k)
	{
		HashSet hs=new HashSet();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]+a[j])%k!=0)
				{
					hs.add(a[i]);
					hs.add(a[j]);
					
					
				}
			}
		}java.util.Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	public static void main(String[] args)
	{
		SubSet s=new SubSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter value to array");
		int[] ar=new int[size];
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter value of k");
		int k=sc.nextInt();
		s.find(ar, k);
	
	}
}
