package com.quantum.javabasics;

import java.util.Scanner;

public class MoveAllZeroToLast {

	public void moveZero(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]==0)
			{
				for(int j=i;j<array.length-1;j++)
				{
				array[j]=array[j+1];
				}
			}
		}array[array.length-1]=0;
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		System.out.println("Enter elements to array");
		int[] array=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		MoveAllZeroToLast object=new MoveAllZeroToLast();
		object.moveZero(array);
	}
}
