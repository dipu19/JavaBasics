package com.quantum.javabasics;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class ACMIPC_PROBLEM {
  public static void main (String[] args)
  {
	  System.out.println("Enter the size of array");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println("Enter the values to array");
	  int [] topic =new int[n];
	  for(int i=0;i<n;i++)
	  {
		  topic[i]=sc.nextInt();
	  }Arrays.sort(topic);
	  int count = 1;
	  int max=topic[0];
      for(int i=0; i < n-1; i++){
          for(int j = i+1; j < n; j++){
              int temp = 0;
              for(int k = 0; k < n; k++)
                  if(topic[i] == '1' )
                      temp++;
              if (temp > max){
                  max = temp;
                  count = 1;
              }
              else if (temp == max)
                  count++;
          }
      }
      int[] ar = {max, count};
      for(int i=0;i<ar.length;i++)
      {
    	  System.out.println(ar[i]);
      }
  }
}
