package com.quantum.javabasics;
import java.util.*;
public class FunnyString {
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int[] arr=new int[s.length()];
		int[] arr1=new int[s.length()-1];
		int[] arr2=new int[s.length()];
		int[] arr3=new int[s.length()-1];
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			arr[i]=(int)s.charAt(i);
		}
		for(int i=0,j=1;i<s.length()-1&j<s.length();i++,j++)
		{
			arr1[i]=Math.abs(arr[i]-arr[j]);
		}
		
		for(int i=0,j=s.length()-1;i<s.length()&j>=0;i++,j--)
		{
			arr2[i]=(int)s.charAt(j);
		}
		
		for(int i=0,j=i+1;i<arr2.length-1&j<arr2.length;i++,j++)
		{
			arr3[i]=Math.abs(arr2[i]-arr2[j]);
		}
		
		for(int i=0;i<arr3.length;i++)
		{
			if(arr1[i]==arr3[i])
			{
				count++;
			}
		}if(count==arr1.length)
		{
			System.out.println("This is funny String ");
		}else
		{
			System.out.println(" Sorry This is not funny String");
		}
		
	}
}
