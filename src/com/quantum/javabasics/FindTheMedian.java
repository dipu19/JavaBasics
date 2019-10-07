package com.quantum.javabasics;
import java.util.*;
public class FindTheMedian {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter element to array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int mid=n/2;
		Arrays.sort(arr);
		System.out.println("Median is "+arr[mid]);

	}

}
