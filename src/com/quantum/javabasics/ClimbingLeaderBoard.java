package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClimbingLeaderBoard {

	public static void main(String[] args)
	{
		int[] scores= {100,100,50,40,40,20,10};
		Arrays.sort(scores);
		int[] alice= {5,25,50,120};
		ArrayList <Integer>arr1=new ArrayList<Integer>();
		int[] rank1=new int[alice.length];
		 arr1.add(scores[0]);
		 for(int i=0,j=1;i<scores.length&j<scores.length;i++,j++)
		 {
				if(scores[i]!=scores[j])
				 {
				 arr1.add(scores[j]);
				 }
		}Collections.sort(arr1);
		for(int i=0;i<alice.length;i++)
		{
			for(int j=0;j<arr1.size();j++)
			{
				if(alice[i]>arr1.get(arr1.size()-1))
				{
					rank1[i]=1;
				}
				 if(alice[i]<arr1.get(j))
				{
					rank1[i]=((arr1.size()+1)-j);
					
					break;
				}
			}
		}
		for(int i=0;i<rank1.length;i++)
		{
			System.out.println(rank1[i]);
		}
		
		 
	}
}
