package com.quantum.javabasics;

public class InsertingInteger {
	public static void main(String[] args)
	{
		int i=20;
		int j=23;
		 int[] numbers= new int[(j-i)+1];
	       int[] numbers1=new int[numbers.length];
	       for(int k=0;k<numbers.length;k++)
	       {
	           numbers[k]=i;
	           i++;
	       System.out.println(numbers[k]);
	       }
				
	}
}
