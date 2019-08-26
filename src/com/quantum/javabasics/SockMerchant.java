package com.quantum.javabasics;

public class SockMerchant {
	public static void main(String[] args)
	{
		int[] arr= {1,1,1,2,2,3,3,3};
		int count=0;
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
		      if(arr[i]>arr[j])
			 {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=arr[i];
				arr[j]=temp;
			 }
		   }
		}
		for(int i=0;i<arr.length-1;i++)
		{  
			
				if(i<arr.length&&arr[i]==arr[i+1])
				{
					count++;
					i=i+1;
				}
		}
		System.out.println(count);
		
		
	}

}
