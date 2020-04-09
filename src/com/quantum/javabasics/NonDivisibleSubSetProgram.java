package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class NonDivisibleSubSetProgram {

	public void hashSet(int[] arr,int k)
	{
	   Set <Integer>set = new  HashSet<Integer>();
	   int count=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if((arr[i]+arr[j])%k!=0)
			   {
				   set.add(arr[i]);
				   set.add(arr[j]);
			   }
			   
		   }
		   
	   }
	   
	   ArrayList <Integer>arr1 = new ArrayList<Integer>(set.size());
	   Iterator<Integer> itr = set.iterator();
	  for(int i=0;i<set.size();i++)
	  {
		  if(itr.hasNext())
		  {
			  arr1.add(itr.next());
		  }
	  }
	  for(int i=0;i<arr1.size();i++)
	  {
		  for(int j=i+1;j<arr1.size();j++)
		  {
			  if((arr1.get(i)+arr1.get(j))%k==0)
			  {
				  System.out.println(arr1.get(i));
				  arr1.remove(i);
				  
				  System.out.println(i);
				  continue;
			  }
		  }
	  }
	  System.out.println("one sub-set of non divisible set..");
	  System.out.println(arr1);
	  System.out.println("Maximum length of non divisible  set");
	  System.out.println(arr1.size());
	   
	  // System.out.println(arr1);
	  
	}
	public static void main(String[] args)
	{
		NonDivisibleSubSetProgram obj = new NonDivisibleSubSetProgram();
		int[] arr= {1,7,2,4};
		int k=3;
		obj.hashSet(arr, k);
	}
}
