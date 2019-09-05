package com.quantum.javabasics;

public class ScoreRank {
	public static void main(String[] args)
	{
	int[] score= {503,502,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503,503};
	int temp=0; 
	int count=0;
	int[] arr= {count,temp};
	for (int i =1,j=i+1;i<score.length&j<score.length;i++,j++)
	{
		
		if(score[i]>score[j])
		{
			count++;
		}
		else if(score[i]<score[j])
		{
			temp++;
		}
		
	}for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
}	
}
