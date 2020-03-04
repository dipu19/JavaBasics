package com.quantum.javabasics;

import java.util.Scanner;

public class QuickLeftRotation {

	
	public void leftRotate(int []array2,int rotation,int size,int[] array)
	{
		for(int i=0;i<size;i++)
		{
			array2[i]=array[i];
			array2[i+size]=array[i];
		}
		int start=rotation%size;
		for(int i=start;i<size+start;i++)
		{
			System.out.print(array2[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter elements to array");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		int[] array2=new int[2*size];
		
		
		System.out.println("Enter number of left rotation");
		int rotation=sc.nextInt();
		QuickLeftRotation object=new QuickLeftRotation();
		
		object.leftRotate(array2, rotation, size,array);
	}
}
