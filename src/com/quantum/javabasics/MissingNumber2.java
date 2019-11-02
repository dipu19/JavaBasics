package com.quantum.javabasics;
import java.util.*;
public class MissingNumber2 {

	public static void main(String[] args)
	{
		System.out.println("Enter the size of arraylist ");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter elements to array");
		ArrayList arr=new ArrayList(n1);
		for(int i=0;i<n1;i++)
		{
			arr.add(sc.nextInt());
	
		}
		System.out.println("Enter the size of 2nd arraylist");
		int n2=sc.nextInt();
		System.out.println("Enter elements to array");
		ArrayList brr=new ArrayList(n2);
		for(int i=0;i<n2;i++)
		{
			brr.add(sc.nextInt());
		}
		//5System.out.println(arr);
		//System.out.println(brr);
		ArrayList abc=new ArrayList();
		for(int i=0;i<arr.size();i++)
		{
			for(int j=0;j<brr.size();j++)
			{
				if(arr.get(i)==brr.get(j))
				{
					brr.remove(j);
					
				}	
		}
	}System.out.println(brr);
	}
}
