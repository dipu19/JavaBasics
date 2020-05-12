package com.quantum.javabasics;

import java.util.ArrayList;

public class CoinProblem {

	public void countWays(int[] arr,int k)
	{
		int count =0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(k%arr[i] == 0 )
			{
				count++;
			}
		}
		for(int i=1;i<arr.length;i++)
		{
			ArrayList<Integer> ar = new ArrayList<Integer>();
			int num = k-arr[i];
			int sum =0;
			for(int j=i-1;j>=0;j--)
			{
				ar.add(arr[j]);
			}
			
			for(int j=i-1;j>=0;j--)
			{
				sum = sum+arr[j];
				if(sum == num)
				{
					count++;
					break;
				}
				
			}
	      

			
		}
		int count1 = 0;
		for(int i=0;i<arr.length;i++)
		{
			int j=1;
			int num1=1;
			while(num1<k-arr[i])
			{
				num1 = arr[i]*j;
				int searchElement = k - num1;
				
				for(int l=i+1;l<arr.length;l++)
				{
					if(searchElement%arr[l] == 0)
					{
						count1++;
						
						
					}
				}
				j=j+1;
			}
		}
		
		System.out.println("Number Of Ways = "+(count+count1));
	}
	public static void main(String[] args)
	{
		CoinProblem cp = new CoinProblem();
		int[] arr = {8,3,1,2};
		cp.countWays(arr, 3);
	}
}
