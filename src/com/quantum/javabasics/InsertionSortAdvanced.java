package com.quantum.javabasics;

public class InsertionSortAdvanced {

	public void insertionSort(int[] arr)
	{
		int shift=0;
		for(int i=1;i<arr.length;i++)
		{
			int j=i;
			
			while(j>0)
			{
				if(arr[j]<arr[j-1])
				{
					int num = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = num;
					shift++;
				}

				j--;
			}
			
			
		}System.out.println(shift);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
	public static void main(String[] args)
	{
		InsertionSortAdvanced object = new InsertionSortAdvanced();
		int[] arr= {2,1,3,1,2};
		object.insertionSort(arr);
	}
}
