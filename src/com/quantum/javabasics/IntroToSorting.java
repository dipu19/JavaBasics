package com.quantum.javabasics;
import java.util.*;
public class IntroToSorting {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter size of array");
	 int size=sc.nextInt();
	 System.out.println("Enter elements to array");
	 int[] arr=new int[size];
	 for(int i=0;i<size;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("enter the element you want to find");
	 int v=sc.nextInt();
	 for(int i=0;i<size;i++)
	 {
		 if(arr[i]==v)
		 {
			 System.out.print(i);
		 }
	 }
			 
 }
}
