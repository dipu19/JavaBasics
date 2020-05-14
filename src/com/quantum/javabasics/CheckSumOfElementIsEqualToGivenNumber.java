package com.quantum.javabasics;

public class CheckSumOfElementIsEqualToGivenNumber {

	public void checkSum(int[]arr, int k)
	{
		int count =0;
		for(int i=0;i<=arr.length/2;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j] == k)
				{
					count++;
				}
			}
		}
		System.out.println("Number of pairs = "+count);
	}
	public static void main(String[] args)
	{
		CheckSumOfElementIsEqualToGivenNumber obj = new CheckSumOfElementIsEqualToGivenNumber();
		int[] arr = {1,2,12,18,8,19};
		int k=20;
		obj.checkSum(arr, k);
	}
}
