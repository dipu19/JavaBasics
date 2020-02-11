package com.quantum.javabasics;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveElement {
//Removing duplicate element from array using set
	
	public void remove(Integer [] arr)
	{
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		java.util.Iterator<Integer> itr=hs.iterator();
		int i=0;
		while(itr.hasNext())
		{
			System.out.println((itr.next()));
		}
		

		
		
	}
	public static void main(String[] args)
	{
		RemoveElement rl=new RemoveElement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter element to array");
		Integer[] arr=new Integer[size];
		for(int k=0;k<size;k++)
		{
			arr[k]=sc.nextInt();
		}
		rl.remove(arr);
	}
			
}
