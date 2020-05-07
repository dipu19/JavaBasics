package com.quantum.javabasics;

public class LilyHomeWork {

	public void homeWork(int[] arr)
	{
		int length = arr.length;
		int count = 0;
		for(int i=0;i<length;i++)
		{
			int min =arr[i];
			int ind = i;
			for(int j=i+1;j<length;j++)
			{
				if(arr[j]<min)
				{
					min = arr[j];
					ind = j;
				}
			}
			if(ind !=i)
			{
				count++;
			}
			int num = arr[i];
			arr[i] = min;
			arr[ind] = num;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("res is "+count);
	}
	public static void main(String[] args)
	{
		int[] arr = {3,4,2,5,1};
		LilyHomeWork obj = new LilyHomeWork();
		obj.homeWork(arr);
	}
}
