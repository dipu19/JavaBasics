package com.quantum.javabasics;

public class InsertionSortMethod {

	public void insertionSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int key=arr[i+1];
			for(int j=i-1;j>=0;j--)
			{
				if(key<arr[j])
				{
					arr[i]=arr[j];
					arr[j]=key;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		InsertionSortMethod object = new InsertionSortMethod()
				;
		int[] arr= {1,5,4,2,3};
		object.insertionSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
