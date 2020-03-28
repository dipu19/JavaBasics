package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DegenerateTriangle {

	public boolean deGenerate(int a, int b, int c)
	{
		if(a+b <= c)
		{
			return true;
		}
		if(a+c <= b)
		{
			return true;
		}
		if(b+c <= a)
		{
			return true;
		}
		return false;
	}
	public int[] checkDegenerate(int[] arr)
	{
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length/2;i++)
		 {
			 int k= arr[i];
			 arr[i] = arr[arr.length-(i+1)];
			 arr[arr.length-(i+1)] = k;
		 }
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int[] arr1 = new int[ar.size()];
		for(int i=0;i<arr.length-2;i++)
		{
			if(!deGenerate(arr[i],arr[i+1],arr[i+2]))
			{
				ar.add(arr[i]);
				ar.add(arr[i+1]);
				ar.add(arr[i+2]);
			}
		}for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
			
		}
		return arr1;
	}
	public static void main(String[] args)
	{
		int [] arr = {1,1,1,3,3};
		DegenerateTriangle object = new DegenerateTriangle();
		System.out.println(object.checkDegenerate(arr));
	}
}
