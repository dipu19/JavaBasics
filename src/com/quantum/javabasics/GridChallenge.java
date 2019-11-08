package com.quantum.javabasics;

import java.util.*;
public class GridChallenge {

	public static void main(String[] args)
	{
		System.out.println("enter value of r");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println("enter value of c");
		int c=sc.nextInt();
		System.out.println("enter values of array");
		char [][] arr=new char[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=(char)sc.nextInt();
			}
		}
		int count=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0,k=j+1;j<c&k<c;j++,k++)
			{
				if((int)arr[i][j]<arr[i][k])
				{
					count++;
				}
			}
			
		}
		
		  for(int i=0;i<c;i++) { for(int j=0,k=j+1;j<r&k<r;j++,k++) {
		  if((int)arr[j][i]<(int)arr[k][i]) { count++; } } }
		 
		System.out.println(count);
		if(count==r*c)
		{
			System.out.println("YES");
		}
		else 
		{
			System.out.println("NO");
		}
	}
}
