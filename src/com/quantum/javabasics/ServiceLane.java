package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Collections;

public class ServiceLane {

	public int service(int[] arr,int start ,int end)
	{
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for(int i=start;i<=end;i++)
		{
			arr1.add(arr[i]);
		}
		Collections.sort(arr1);
		int min=arr1.get(0);
		return min;
	}
	
	public static void main(String[] args)
	{
		ServiceLane obj = new ServiceLane();
		int[] arr= {1,4,3,2};
		int start = 0;
		int end = 3;
		System.out.println("The limit of veichle width to ");
		System.out.println(obj.service(arr, start, end));
	}
}
