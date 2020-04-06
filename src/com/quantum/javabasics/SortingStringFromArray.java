package com.quantum.javabasics;

public class SortingStringFromArray {

	public void sort(String[] str)
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp = str[j];
					str[j] = str[i];
					str[i] =temp;
				}
			}
		}
		System.out.println("Sorted in alphabetically.. ");
		System.out.println();
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		String[] arr = {"Dipu","Aju","Ram","Biju"};
		SortingStringFromArray obj = new SortingStringFromArray();
		obj.sort(arr);
		
	}
}
