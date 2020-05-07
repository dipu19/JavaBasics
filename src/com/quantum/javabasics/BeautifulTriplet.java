package com.quantum.javabasics;

import java.util.ArrayList;

public class BeautifulTriplet {

	public void triplet(int[] arr,int d)
	{
		int length = arr.length;
		int result = 0;
		for(int i=0;i<length;i++)
		{
			int j=i;
			int count =1;
			for(int k=j;k<arr.length;k++)
			{
				if(arr[j]+d ==arr[k])
				{
					count++;
					j=k;
					System.out.println(j);
				}
			}System.out.println("Count"+count);
			if(count >= 3)
			{
				result++;
			}
			
		}
		System.out.println("result is "+result);
	}
	public static void main(String[] args)
	{
		int[] arr = {2,2,3,4,5};
		int d = 1;
		BeautifulTriplet obj = new BeautifulTriplet();
		obj.triplet(arr, d);
		
	}
}
