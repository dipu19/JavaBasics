package com.quantum.javabasics;

public class BinarySearch {
	
	public static void main(String[] args)
	{
		int [] arr= {15,12,25,50,1,2};
		int start=0;
		int end=arr.length-1;
		int x=12;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(x==arr[mid])
			{
				System.out.println( "value is there");
				
			}
			
			else	if(x<arr[mid])
				{
					end=mid-1;
				}
			else	if(x>arr[mid])
				{
					start=mid+1;
				}
			
			
				
		}if(start==-1||end==arr.length)
		{
			System.out.println("number is not there");
		}
		
	}
}
