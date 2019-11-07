package com.quantum.javabasics;
import java.util.*;

public class ClosestNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int [] a=new int[n];
		ArrayList <Integer>ar=new ArrayList<Integer>();
		int []ar1=new int[ar.size()];
		System.out.println("Enter values to array");
		 for(int i=0;i<n;i++)
	        {
	            a[i] = sc.nextInt();
	        }
	        Arrays.sort(a);
	        int d =a[1]-a[0],id=0;
	        for(int i=1;i<n;i++)
	        {
	            if(d>Math.abs(a[i]-a[i-1]))
	            {
	                d = Math.abs(a[i]-a[i-1]);
	                id = i-1;
	            }
	        }
	        for(int i=id;i<n-1;i++)
	        {
	            if(d==Math.abs(a[i]-a[i+1]))
	              ar.add(a[i]);
	            ar.add(a[i+1]);
	        }
	        for(int i=0;i<ar1.length;i++)
	        {
	        	ar1[i]=ar.get(i);
	        }
	        for(int i=0;i<ar1.length;i++)
	        {
	        	System.out.println(ar1[i]);
	        }System.out.println(ar);
	}
}
