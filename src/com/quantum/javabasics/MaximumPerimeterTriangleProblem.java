package com.quantum.javabasics;

public class MaximumPerimeterTriangleProblem {
//finding longest triangle arms if number of inputs in array is divisible by 3. 
	public void checkTriangle(int[] arr)
	{
		int i=0;
		int size = 3;
		int [] ar=new int[3];
		
		int totalLength = 0;
		while(i<arr.length)
		{
			
		if(arr[i]+arr[i+1]>arr[i+2])
		{
			if(arr[i]+arr[i+1]+arr[i+2]>totalLength)
			{
				totalLength = arr[i]+arr[i+1]+arr[i+2];
			
			ar[0]=arr[i];
			ar[1]=arr[i+1];
			ar[2]=arr[i+2];
			}
		
		
		}
		if(i +3>arr.length)
		{
			int index=(size+3)-arr.length;
		    i=i+(size-index);
		}
		else
		{
			i=i+3;
			
		}
	
		
		}
		
		for(int j=0;j<3;j++)
		{
			System.out.print(ar[j]+" ");
		}
		
		
		
		
	}
	public static void main(String[] args)
	{
		MaximumPerimeterTriangleProblem  object =new MaximumPerimeterTriangleProblem ();
		int[ ] arr = {9,10,11,12,13,15,1,2,3,4,5,8};
		object.checkTriangle(arr);
	}
}
