package com.quantum.javabasics;

public class RunningTimeAlgorithims {
	
	public void count(int[] arr)
	{
		int count= 0;
		for(int i=0,j=1;i<arr.length&j<arr.length;i++,j++)
		{
			
			if(arr[j]<arr[i])
			{
				for(int k=0;k<j;k++)
				{
					
					if(arr[j]<arr[k])
					{int num = arr[j];
						for(int l=j;l>k;l--)
						{
							
							arr[l]=arr[l-1];
						}
						count = count+(j-k);
						arr[k] =num;
					}
				}
			}
			
		}System.out.println(count);
	}
	public static void main(String[] args)
	{
		RunningTimeAlgorithims object = new RunningTimeAlgorithims();
		int[] arr = {2,1,3,1,2,};
		object.count(arr);
	}
}
