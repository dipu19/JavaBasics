package com.quantum.javabasics;

import java.util.Arrays;

public class TypesOfElementPresent {

	public void countMoves(int[] arr)
	{
		int length = arr.length;
		int count = 0;
		Arrays.sort(arr);
		for(int i=0;i<length;i++)
		{
			for(int j = i+1;j<length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					i = j;
					
				}
				
			}
		}
		int differentElement = length - count;
		System.out.println("Types of element present = "+differentElement);
	}
	public static void main(String[] args)
	{
		int[] arr = {1,4,1,4,1};
		TypesOfElementPresent obj= new TypesOfElementPresent();
		obj.countMoves(arr);
	}
}
