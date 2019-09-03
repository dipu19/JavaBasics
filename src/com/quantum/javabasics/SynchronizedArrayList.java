package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedArrayList {
	 
		static List<Integer> method1()
		{
			List<Integer> result = new ArrayList<>(2);
			result.add(0);
			result.add(0);
			
			ArrayList<Integer> arr1 = new ArrayList<>();
			ArrayList<Integer> arr2 = new ArrayList<>();
			arr1.add(15);
			arr1.add(12);
			arr1.add(8);
			arr2.add(4);
			arr2.add(3);
			arr2.add(9);
			for(int i=0;i<arr1.size();i++)
			{
			   if( arr1.get(i)>arr2.get(i))
			   {
				   result.set(0, result.get(0)+1);
			   }
			   else if (arr2.get(i)>arr1.get(i))
			   {
				   result.set(1, result.get(1)+1);
			   }
			}return result;
		}
		
		 public static void main(String[] args)
		 {
			List<Integer> result = method1();
			System.out.println(result.get(0) +" "+result.get(1));
		 }
}
