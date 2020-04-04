package com.quantum.javabasics;

import java.util.Arrays;

public class SpaceStation {

	public void station(int[] arr,int c)
	{
		int[] arr1=new int[c];
		for(int i=0;i<c;i++)
		{
			int dis = c;
			//System.out.println(dis);
			for(int j=0;j<arr.length;j++)
			{
				int diff = Math.abs(arr[j]-i);
				
                if(diff<dis)
                {
                	dis = diff;
                }
			}
			
			arr1[i] = dis;
		}
		Arrays.sort(arr1);
		System.out.println(arr1[arr1.length-1]);
	}
	public static void main(String[] rgs)
	{
		SpaceStation obj = new SpaceStation ();
		int[] arr= {0,1,2,3,4};
		int c=5;
		obj.station(arr, c);

	}
}
