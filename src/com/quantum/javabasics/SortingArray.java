package com.quantum.javabasics;
import java.util.ArrayList;
public class SortingArray {

	public static void main(String[] args) {
		int[] arr= {1,2,4,6,3};
		ArrayList <Integer>ar=new ArrayList<Integer>();
		int number=0;
		for(int i=0;i<arr.length;i++)
		{
			ar.add(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[j]<arr[i])
			{
				number=arr[j];
				
			}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(number<ar.get(i))
			{
				ar.add(i,number);
				break;
			}
		}for(int i=0;i<arr.length;i++)
		{
			System.out.println(ar.get(i));
		}
		

	}

}
