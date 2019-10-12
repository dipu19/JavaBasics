package com.quantum.javabasics;
import java.util.*;
public class SherlockAndArray {
  public static void main(String[] args)
  {//checking the sum of numbers before and after a number is equal or not.
	  System.out.println("Enter the size of array");
	  Scanner sc=new Scanner(System.in);
	  int si=sc.nextInt();
	  System.out.println("Enter value to array");
	  int[] arr=new int[si];
	  for(int i=0;i<si;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int number=0;
	  int count=0;
	  for(int i=0;i<si;i++)
	  {
		  int sum1=0;
		  int sum2=0;
		  for(int j=0;j<i;j++)
		  {
			  sum1=sum1+arr[j];
		  }
		  for(int k=i+1;k<si;k++)
		  {
			  sum2=sum2+arr[k];
		  }
		  if(sum1==sum2)
		  {
			  number=arr[i];
			  count++;
		  }
	  }
	  if(count==1)
	  {
		  System.out.println("number is "+number);
	  }
	  if(count==0)
	  {
		  System.out.println("Sorry");
	  }
  }
}
