package com.quantum.javabasics;

import java.util.Scanner;

public class RotationOfArray {

	public void rotate(int[] arr,int n)
	{
		
		 for(int i = 0; i <n; i++){    
	            int j, last;    
	               
	            last = arr[arr.length-1];    
	            
	            for(j = arr.length-1; j > 0; j--){    
	                arr[j] = arr[j-1];    
	            }    
	             
	            arr[0] = last;    
	        } 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}
	public static void main(String[] args)
	{
		RotationOfArray roa=new RotationOfArray();
		System.out.println("Enter the array size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter value to array");
		int[] ar=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		roa.rotate(ar,n);
		
	}
}
