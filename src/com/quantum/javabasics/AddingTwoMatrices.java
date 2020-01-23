package com.quantum.javabasics;

import java.util.Scanner;

public class AddingTwoMatrices {
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the no of rows");
		int rows=sc.nextInt();
		System.out.println("please enter the no of col");
		int col=sc.nextInt();
		int[][] matrices1=new int[rows][col];
		int[][] matrices2=new int[rows][col];
		int[][] result=new int[rows][col];
		System.out.println("enter the value to matrices1");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrices1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the value to matrices2");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrices2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				result[i][j]=matrices1[i][j]+matrices2[i][j];
			}
		}
		for(int i=0;i<rows;i++)
			
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(result[i][j]);
			}
		}
	}

	
}
