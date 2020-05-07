package com.quantum.javabasics;



public class MaximumPerimeterFromHackerRank {

	public void maxPeri(int[] arr)
	{
		int  max=0;
		for(int i=0;i<arr.length-3;i++)
		{
			int k=i;
			int count=0;
			int max1=0;
			if(arr[k]+arr[k+1]>arr[k+2])
			{
				count=1;
			}
			if(count==1)
			{
			for(int j=i;j<i+3;j++)
			{
			 max1=max1+arr[j];
			}
			}
			if(max1>max)
			{
				max=max1;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args)
	{
		
		int[] arr = {1,1,1,3,3};
		MaximumPerimeterFromHackerRank  obj = new MaximumPerimeterFromHackerRank ();
		obj.maxPeri(arr);
		
	}
}
