package com.quantum.javabasics;
import java.util.*;
public class JimAndOrder {

	public static void main(String[] args) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		ArrayList <Integer>ar=new ArrayList<Integer>();
		int[][] orders=new int[2][2];
		orders[0][0]=1;
		orders[0][1]=3;
		orders[1][0]=1;
		orders[1][1]=1;
		for(int i=0;i<orders.length;i++)
		{
			int sum=orders[i][0]+orders[i][1];
			 result.add(sum);
			 
		}for(int i=0;i<result.size();i++)
		{
			ar.add(result.get(i));
			
		}Collections.sort(ar);
		int[] ar2=new int[result.size()];
		
		for(int i=0;i<ar.size();i++)
		{
			
			for(int j=0;j<result.size();j++)
			{
				if(ar.get(i)==result.get(j))
				{
					ar2[i]=j+1;
				}
			}
		}for(int i=0;i<ar2.length;i++)
		{
			System.out.println(ar2[i]);
		}
		

	}

}
