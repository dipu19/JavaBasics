package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayProblem {

	public void calculate(int[] arr)
	{
		ArrayList <Integer>left=new ArrayList<Integer>();
		ArrayList <Integer>right=new ArrayList<Integer>();
		for(int i=0,j=arr.length-1;i<arr.length/2&j>=arr.length/2;i++,j--)
		{
			left.add(arr[i]);
			right.add(j);
		}
		
		while(left.size()!=0||right.size()!=0)
		{
			int add1=0;
			int add2=0;
			for(int i=0;i<left.size();i++)
			{
				add1=add1+left.get(i);
			}
			for(int i=0;i<right.size();i++)
			{
				add2=add2+right.get(i);
			}
			if(add1<add2)
			{
				System.out.println("right arraylist size is increase by 1");
				left.add(right.get(0));
				right.remove(0);
			}
			if(add2<add1)
			{
				System.out.println("left arraylist size is increase by 1");
				
				left.remove(0);
			}
			System.out.println();
		}
			
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter element to array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayProblem ar=new ArrayProblem();
		ar.calculate(arr);
	}
}
