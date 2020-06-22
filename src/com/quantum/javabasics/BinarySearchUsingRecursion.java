package com.quantum.javabasics;



public class BinarySearchUsingRecursion {
	
	

	public int search(int[] arr,int x)
	{
		int l= 0;
		int r = arr.length-1;
		
		return  search1(arr,l,r ,x);
	}
	public int search1(int[] arr,int l, int r, int x)
	{
		if(r>=l)
		{
	      int mid = (l+r)/2;
	      if(x>arr[mid])
	      {
	    	  return search1(arr,mid+1,r,x);
	      }
	      if(x == arr[mid])
	      {
	    	  return mid;
	      }
	      if(x < arr[mid])
	      {
	    	  return search1(arr,l,mid-1,x);
	      }
		}
		return -1;
	}
	

	public static void main(String[] args) throws ClassNotFoundException
	{
	  int[] arr = {1,5,6,9};
	  int l = 0;
	  int r = arr.length-1;
	  BinarySearchUsingRecursion obj = new BinarySearchUsingRecursion();
	 System.out.println( obj.search(arr, 10));
	  
	}
}
