package com.quantum.javabasics;

import java.util.*;
public class CountingSort1 {

	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scanner.nextInt();
		System.out.println("Enter elements to array ");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		 int pivot=arr[0];
         
       for(int i=1;i<n;i++){
       if(pivot>arr[i]){
       for(int j=i;j>0;j--){
          int temp=arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
      }
  }
}
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println(arr[i]);
       }
	}
}
