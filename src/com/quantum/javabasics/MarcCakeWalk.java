package com.quantum.javabasics;

import java.util.*;

public class MarcCakeWalk {
	public static void main(String[] args) {
		
		  System.out.println("Enter the size of cup array"); Scanner sc=new
		  Scanner(System.in); int n=sc.nextInt(); int[] arr=new int[n]; int[] arr1=new
		  int[n]; System.out.println("Enter value to array"); for(int i=0;i<n;i++) {
		  arr[i]=sc.nextInt(); 
		  }
		   Arrays.sort(arr);    
		  for(int i=0,j=arr.length-1;i<arr.length&j>=0;i++,j--) 
		   { 
			  arr1[i]=arr[j]; 
		   } 
		  for(int i=0;i<n;i++) 
		   { 
		      System.out.println(arr1[i]);
		   }
		  double sum=0;
		  for(int i=0;i<n;i++) 
		   { 
			  sum=((Math.pow(2,i)*arr1[i]))+sum;
		   }
		     System.out.println(" final vlaue is "+(int)sum);
		 
	}
}
