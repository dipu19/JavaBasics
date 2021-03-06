package com.quantum.javabasics;
import java.util.*;
public class LargestPermutation {
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array size");
	    int n = input.nextInt();
	    System.out.println("Enter number of swap value");
	 
	    int k = input.nextInt();
	    System.out.println("Enter value to array");
	    int[] a = new int[n];
	    int[] index = new int[n+1 ];
	    for (int i = 0; i < n; i++) {
	        a[i] = input.nextInt();
	        index[a[i]] = i;
	    }
	    for (int i = 0; i < n && k > 0; i++) {
	        if (a[i] == n - i) {
	            continue;
	        }
	        a[index[n - i]] = a[i];
	        index[a[i]] = index[n - i];
	        a[i] = n - i;
	        index[n - i] = i;
	        k--; 
	    }
	    for (int i = 0; i < n; i++) {
	        System.out.print(a[i] + " ");
	    }
}
}