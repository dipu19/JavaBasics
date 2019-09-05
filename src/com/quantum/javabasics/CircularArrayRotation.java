package com.quantum.javabasics;

public class CircularArrayRotation {
	public static void main(String[] args)
	{
   int [] arr= {1,2,3,4,5};
   int[] arr1=new int[arr.length];
   arr1[arr1.length-1]=arr[0];
   for(int i=0,j=1;i<arr1.length-1&j<arr.length;i++,j++)
   {
	   arr1[i]=arr[j];;
   }
   for(int i=0;i<arr1.length;i++)
   {
	   System.out.println(arr1[i]);
   }
}
}
