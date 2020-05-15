package com.quantum.javabasics;

import java.util.ArrayList;

public class FindCommonElementFromTwoArrays {

	public void find(int[] firstArray, int[] secondArray)
	{
        int length1 = firstArray.length;
        int length2 = secondArray.length;
        
        ArrayList <Integer>ar = new ArrayList<Integer>();
        for(int i=0;i<length1;i++)
        {
        	for(int j=0;j<length2;j++)
        	{
        		if(firstArray[i] == secondArray[j])
        		{
        			ar.add(firstArray[i]);
        		}
        	}
        }
        
        System.out.println("Common elements are "+ar);
	}
	public static void main(String[] args)
	{
		int arr1[] = {1,4,7, 9, 2};
		int arr2[] = {1,7,3,4,5};
		FindCommonElementFromTwoArrays obj = new FindCommonElementFromTwoArrays();
		obj.find(arr1, arr2);
	}
}
