package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulDoubles {

	public void Triplet(int[] arr,int d)
	{
		ArrayList <Integer>ar=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+d==arr[j])
				{
					ar.add(i);
					ar.add(j);
					
				}
			}
			
		}
		
		for(int i=0;i<ar.size();i++)
		{
			if(i%2==0&i>0)
			{
				System.out.println();
			}
			System.out.print(ar.get(i)+" ");
			
			
		}
	}
	public static void main(String[] args)
	{
	   System.out.println("Enter the length of array");
	    Scanner sc=new Scanner(System.in);
	    int length=sc.nextInt();
	    int[] arr=new int[length];
	    System.out.println("Enter element to array");
		 for(int i=0;i<length;i++) { arr[i]=sc.nextInt(); }
		 
	    
	    System.out.println("Enter the value of d");
	    int d=sc.nextInt();
	    BeautifulDoubles bf=new BeautifulDoubles();
	    bf.Triplet(arr, d);
	}
}
