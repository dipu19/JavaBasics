package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteraterArrayListUsingDiiferentMethod {
 
	public void usingForLoop(ArrayList<Integer> arr)
	{
		int length = arr.size();
		for(int i=0;i<length;i++)
		{
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}
	public void usingAdvancedForLoop(ArrayList <Integer>arr)
	{
		for(Integer element:arr)
		{
			System.out.print(element+" ");
		}System.out.println();
	}
	public void usingWhileLoop(ArrayList <Integer>arr)
	{
		Iterator<Integer> itr = arr.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
	}
	public static void main(String[] args)
	{
		IteraterArrayListUsingDiiferentMethod object = new IteraterArrayListUsingDiiferentMethod();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the size of ArrayList");
		int size = sc.nextInt();
		System.out.println("Enter elements to arraylist");
		ArrayList<Integer> arr = new ArrayList<Integer>(size);
		for(int i = 0;i<size;i++ )
		{
			arr.add(sc.nextInt()) ; 
		}
		object.usingForLoop(arr);
		object.usingAdvancedForLoop(arr);
		object.usingWhileLoop(arr);
	}
}
