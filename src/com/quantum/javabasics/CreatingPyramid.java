package com.quantum.javabasics;

import java.util.Scanner;

public class CreatingPyramid {

	public void create(int height)
	{
		for(int i=0;i<height;i++)
		{
		  for(int j=0;j<(height)-i;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=0;k<i;k++)
		  {
			  System.out.print('*'+" ");
		  }System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of pyramid");
		int height=sc.nextInt();
		CreatingPyramid cp=new CreatingPyramid();
		cp.create(height);
	}
}
