package com.quantum.javabasics;

public class MinimalDistance {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,2};
		int dis=0;
		int min=arr.length;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				  dis=Math.abs(j-i);
				  if(dis<min)
				  {
					  min=dis;
				  }count++;
				} 
				
					 
			}
		}if(count==0)
		{
			min=-1;
		}
		System.out.println(min);
				
				
			
		
	}

}
