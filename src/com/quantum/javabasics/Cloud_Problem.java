package com.quantum.javabasics;
import java.util.*;
public class Cloud_Problem {
  public static void main(String[] args)
  {
	  System.out.println("Enter the size of array");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int[] arr=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int count = -1;
      for (int i = 0; i < n; i++, count++) {
          if (i<n-2 && arr[i+2]==0) i++;
      }System.out.println("Count = "+count);
  }
}
