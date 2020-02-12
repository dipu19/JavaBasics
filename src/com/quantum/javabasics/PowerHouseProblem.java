package com.quantum.javabasics;

import java.util.Scanner;

public class PowerHouseProblem {

	public void dis(int[] ar,int[] ph)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{int dis=ar.length;
			for(int j=0;j<ph.length;j++)
			{
			    int dis1=Math.abs(ar[i]-ph[j]);
			   if(dis1<dis)
			   {
				   dis=dis1;
			   }
			}
			if(dis>count)
			{
				count=dis;
			}
		}System.out.println("Distance is "+ count); 
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the size of cities array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=i+1;
		}
		System.out.println("Enter the no of power house");
		int no=sc.nextInt();
		int[] ph=new int[no];
		System.out.println("Enter the power house ");
		for(int i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}
		PowerHouseProblem php=new PowerHouseProblem();
	    php.dis(arr, ph);
	}
}
