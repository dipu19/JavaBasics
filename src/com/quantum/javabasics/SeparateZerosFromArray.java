package com.quantum.javabasics;

import java.util.ArrayList;

public class SeparateZerosFromArray {

	public void separateZeros(int[] array)
	{
		int length = array.length;
		
		
		
		ArrayList <Integer>resultArray  = new ArrayList<Integer>();
		
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i] != 0)
			{
				resultArray.add(array[i]);
			}
		}
		
		int size = resultArray.size();
		
		int diff = length-size;
		
		int [] resultArr = new int[length];
		if(diff>0)
		{
			for(int i=0;i<diff;i++)
			{
				resultArr[i] =0; 
			}
			for(int i=diff,j=0;i<length&j<size;i++,j++)
			{
				resultArr[i] = resultArray.get(j);
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(resultArr[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		SeparateZerosFromArray object = new SeparateZerosFromArray();
		
		int[] array = {1,0,2,3,0,4};
		
		object.separateZeros(array);
		
		
	}
}
