package com.quantum.javabasics;
import java.util.*;
public class InsertionSortPart1 {
 public static void main(String[] args)
 {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the size of array");
	 int size=scanner.nextInt();
	 System.out.println("Enter  values to array");
	 int[] arr=new int[size];
	 ArrayList<Integer> al=new ArrayList<Integer>(arr.length);
	 for(int i=0;i<size;i++)
	 {
		 arr[i]=scanner.nextInt();
	 }
	 
	 int temp=arr[size-1];
	for(int j=arr.length-2;j>=0;j-- )
	{
		if(temp<arr[j])
		{
			arr[j+1]=arr[j];
			if(j==0&&temp<arr[j])
			{
				arr[j]=temp;
			}
			
		}
		else
		{
			//if(temp>arr[j])
			{
				arr[j+1]=temp;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}System.out.print("\n");
	}
	 
	 
 }
}
