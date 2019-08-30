package com.quantum.javabasics;

import java.util.ArrayList;

public class SequenceEquation {
	public static void main(String[] args)
	{
		int[] arr= {4,3,5,1,2};
		ArrayList<Integer> arr1=new ArrayList<Integer>(arr.length);
		ArrayList <Integer>value=new ArrayList<Integer>(arr.length);
		for(int i=1;i<=arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==arr[j])
				{
					arr1.add(j+1);
				}
			}
		}
		for(int i=0;i<arr1.size();i++)
		{
			for(int j=0;j<arr1.size();j++)
			{
				if(arr1.get(i)==arr[j])
				{
					value.add(j+1);
				}
			}
		}for(int i=0;i<arr1.size();i++)
		{
			System.out.println(value.get(i));
		}
	}

}
