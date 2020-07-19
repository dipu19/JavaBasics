package com.quantum.javabasics;

import java.util.Scanner;

public class SendNoticeToClient {

  public static int sendNotice(int[] expenditure,int d)
  {
	  int notice = 0;
	  if(expenditure.length>=d+2)
	  {
		  int rotation = expenditure.length-(d+2);
		  for(int i=0;i<rotation+1;i++)
		  {
			  int[] array = new int[d];
			  for(int j=0;j<d;j++)
			  {
				  array[j] = expenditure[j];
			  }
			  int mid = array.length/2;
			  if((2*array[mid])>=expenditure[i+d])
			  {
				  notice++;
			  }
			  System.out.println(i);
		  }
	  }
	  return notice;
  }
  public static void main(String[] args)
  {
	  System.out.println("Enter the size of array");
	  Scanner sc = new Scanner(System.in);
	  int size = sc.nextInt();
	  System.out.println("Enter number of days");
	  int days = sc.nextInt();
	  int[] arr = new int[size];
	  for(int i=0;i<size;i++)
	  {
		  System.out.println("Enter element to array");
		  arr[i] = sc.nextInt();
	  }
	  System.out.println(sendNotice(arr, days));
	  
  }
}
