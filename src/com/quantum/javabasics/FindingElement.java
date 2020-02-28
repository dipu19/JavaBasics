package com.quantum.javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class FindingElement {
	//finding element in a rotated array
	public void insert(int[] arr,int d,int key)
	{
		
			Arrays.sort(arr);
		for(int j=0;j<d;j++)
		{
		int x = arr[arr.length-1]; 
	       for (int i = arr.length-1; i > 0; i--) 
	          arr[i] = arr[i-1]; 
	       arr[0] = x;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		if(key>=arr[0])
		{
			for(int i=0;i<d;i++)
			{
				if(arr[i]==key)
				{
					System.out.println("element "+ key +" found at "+i+" index");
				}
			}
		}
		else if(key<arr[0])
		{
			for(int i=arr.length-1;i>arr.length-d;i--)
			{
				if(key==arr[i])
				{
					System.out.println("element "+ key +" found at "+i+" index");
				}
			}
		}
		else
		{
			System.out.println("Element is not there inside array");
		}
		
		
	}
	public static void main(String[] arr)
	{  
		//please insert sorted element.
		System.out.println(" * Please insert elements in ascending order \n other wise we will make that in asccending order.");
		FindingElement fe=new FindingElement();
		System.out.println();
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter element to array");
		int[] ars=new int[size];
		for(int i=0;i<size;i++)
		{
			ars[i]=sc.nextInt();
		}
		System.out.println("Enter how many times you want to rotate");
		int rotate=sc.nextInt();
		System.out.println("Enter the value you want to find");
		int key=sc.nextInt();
		fe.insert(ars, rotate,key);  
	}
}
