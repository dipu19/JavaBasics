package com.quantum.javabasics;

//Sorting element in own order
import java.util.Arrays;
import java.util.Scanner;

public class SortingElement {

	public void sort(int[] ar)
	{
		Arrays.sort(ar);
		int[] arr=new int[ar.length];
		for(int i=ar.length-1, j=0;i>=ar.length/2&j<arr.length;i--,j++)
		{
			arr[j]=ar[i];
			j++;
		}
		for(int i=0,j=1;i<ar.length/2&j<arr.length;i++,j++)
		{
			arr[j]=ar[i];
			j++;
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter values to array");
		int[] ar1=new int[size];
		for(int i=0;i<size;i++)
		{
			ar1[i]=sc.nextInt();
		}
		SortingElement st=new SortingElement();
		st.sort(ar1);
	}

}
