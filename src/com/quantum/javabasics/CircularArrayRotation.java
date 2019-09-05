package com.quantum.javabasics;

public class CircularArrayRotation {
	public static void main(String[] args)
	{
   int [] a= {1,2,3,4,5};
   int[] arr1=new int[a.length];
   arr1[arr1.length-1]=a[0];
   for(int i=0,j=1;i<arr1.length-1&j<a.length;i++,j++)
   {
	   arr1[i]=a[j];;
   }
   for(int i=0;i<arr1.length;i++)
   {
	   System.out.println(arr1[i]);
   }
}
}
