package com.quantum.javabasics;

import java.util.ArrayList;

public class RemovingDuplicateElement {
	public static void main(String[] args)
	{
		int[] arr= {4,5,6,7,7,8,9,9,10,10};
		 ArrayList arr1=new ArrayList(100);
		 arr1.add(arr[0]);
		 for(int i=0,j=1;i<arr.length&j<arr.length;i++,j++)
		 {
			  if(arr[i]!=arr[j])
				 {
				 arr1.add(arr[j]);
				 }
		 }
		    for(int i=0;i<arr1.size();i++)
		 {
			 System.out.println(arr1.get(i));
		 }
	 }

}
