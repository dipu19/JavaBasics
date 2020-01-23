package com.quantum.javabasics;

import java.util.Scanner;

public class MultiplicationOfMatrices {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the no of rows");
		int rows=sc.nextInt();
		System.out.println("Enter the no of col");
		int col=sc.nextInt();
		int[][] matrices1=new int[rows][col];
		System.out.println("Enter the values to matrices1");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrices1[i][j]=sc.nextInt();
			}
		}
		int[][] matrices2=new int[rows][col];
		System.out.println("Enter the values to matrices2");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrices2[i][j]=sc.nextInt();
			}
		}int[][] result=new int[rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				result[i][j]=matrices1[i][j]*matrices2[i][j];
			}
		}
		System.out.println("Result ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(result[i][j]+" ");
			}System.out.println();
		}
		
	}
}
