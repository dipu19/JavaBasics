package com.quantum.javabasics;

public class MergeSorting {
	int array[];
	int length;
	int[] tempMergeArray;
	public static void main(String[] args)
	{
		int[] inputArray= {15,25,5,258,14};
		MergeSorting m=new MergeSorting();
		m.sort(  inputArray);
		for(int i=0;i<inputArray.length;i++)
		{
			System.out.println(i);
		}
	}
	public void sort( int inputArray[])
	{
		array=inputArray;
		length=inputArray.length;
		tempMergeArray=new int[length];
	}
	public void divideArray(int lowerIndex,int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			divideArray(lowerIndex,middle);
			divideArray(middle+1,higherIndex);
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}
	public void mergeArray(int lowerIndex,int middle,int higherIndex)
	{
		for(int i=lowerIndex;i<higherIndex;i++)
		{
			tempMergeArray[i]=array[i];
			
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=higherIndex;
		while(i<=middle&&j<=higherIndex)
		{
			if(tempMergeArray[i]<tempMergeArray[j])
			{
				array[k]=tempMergeArray[i];
				i++;
			}
			else
			{
				array[k]=tempMergeArray[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			array[k]=tempMergeArray[i];
			k++;
			i++;
		}
	}
}
