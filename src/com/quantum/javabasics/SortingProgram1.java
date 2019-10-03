package com.quantum.javabasics;
import java.util.*;
public class SortingProgram1 {

	public static void main(String[] args) {
		System.out.println("Enter the Size of array");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the value to array");
		String [] arr=new String[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.toString();
			
		}for(int i=0;i<size;i++)
		{
			for(int j=1;j<size;j++)
			{
				if(arr[i].length()>arr[j].length())
				{
					String s=arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
			}
		}for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
					

	}

}
