package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Arrays;

public class ComparingArrays {

	public void missing(int[] brr,int[] arr)
	{
		Arrays.sort(brr);
		Arrays.sort(arr);
		ArrayList <Integer>ar = new ArrayList<Integer>();
		for(int i=0;i<brr.length;i++)
		{
			int count = 1;
			int count1 = 0;
			for(int j=i+1;j<brr.length;j++)
			{
				if(brr[i] == brr[j])
				{
					count++;
				}
			}
			for(int k=0;k<arr.length;k++)
			{
				if(brr[i] == arr[k])
				{
					count1++;
				}
			}
			
			if(count>count1)
			{
				
				int result =count - count1;
				for(int l =0;l<result;l++)
				{
					ar.add(brr[i]);
				}
			}
		}
		System.out.println(ar);
	}
	public static void main(String[] args)
	{
		int[] original= {7,2,5,4,6,3,5,3};
		int[] duplicate = {7,2,5,3,5,3};
		ComparingArrays obj = new ComparingArrays();
		obj.missing(original, duplicate);
	}
}
