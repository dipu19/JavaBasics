package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Collections;

public class HackerLandRadio {

	public void countNoOfStation(int[] x,double range)
	{
		int count = 0;
		
		ArrayList <Integer>ar = new ArrayList<Integer>();
		for(int i=0,j=1;i<x.length&j<x.length;i++,j++)
		{
			ar.add(Math.abs(x[i]-x[j]));
		}
		Collections.sort(ar);
		System.out.println(ar);
		
		for(int i=0 ;i<ar.size()-1;i++)
		{
			if(ar.get(i) == ar.get(i+1))
			{
				if(ar.get(i)<=range)
				{
					count++;
				}
				else
				{
					count= count+3;
				}
				
				
			}
			else
			{
				count = count+2;
			}
			

		}
		System.out.println("Count = "+count);
		
	}
	public static void main(String[] args)
	{
		int[] x= {1,2,3,4,5};
		HackerLandRadio obj = new HackerLandRadio();
		obj.countNoOfStation(x, 1);
	}
}
