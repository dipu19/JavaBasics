package com.quantum.javabasics;

public class AddTwoMatrics {
public static void main(String[] args)
{
	int[][] arr=new int[2][2];
	arr[0][0]=2;
	arr[0][1]=3;
	arr[1][0]=2;
	arr[1][1]=3;
	int[][]arr2=new int[2][2];
	int[][]arr1=new int[2][2];
	arr1[0][0]=5;
	arr1[0][1]=2;
	arr1[1][0]=2;
	arr1[1][1]=2;
	for(int i=0;i<arr1.length;i++)
	{
		for(int  j=0;j<arr1.length;j++)
		{
			arr2[i][j]=arr[i][j]+arr1[i][j];
		}
	}for(int i=0;i<arr1.length;i++)
	{
		for(int  j=0;j<arr1.length;j++)
		{
			System.out.println(arr2[i][j]);
		}
	}
}
}
