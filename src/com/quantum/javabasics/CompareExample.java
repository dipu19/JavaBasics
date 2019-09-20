package com.quantum.javabasics;
import java.util.*;

public class CompareExample  {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
			ArrayList<Integer>	arr=new ArrayList<Integer>(n);
		System.out.println("Enter the value of array");
		{
			for(int i=0;i<n;i++)
			{
				arr.add(s.nextInt());
			}
		}
	   Collections.sort(arr);
	   System.out.println("After Sorting the ArrayList");
	   try
	   {
	   for(int i=0;i<n;i++)
		{
		   
			System.out.println(arr.get(i));
			Thread.sleep(7000);
		}
	   }catch(Exception e)
	   {
		   System.out.println("Exception occured");
	   }
	}

}
 