package com.quantum.javabasics;


import java.util.*;
public class InsertionSort {
   public static void main(String[] args)
   {
	   System.out.println("Enter the value of n");
	   Scanner sc=new Scanner (System.in);
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   System.out.println("Enter values to array");
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i]=sc.nextInt();
	   }for(int k=0;k<arr.length-1;k++){
	         for(int i=0;i<arr.length-1;i++){
	             int key = arr[k+1];
	                if(i==k+1)
	                    break;           
	                if(arr[i]>key){
	                    arr[k+1]=arr[i];
	                    arr[i]=key;
	                }
	            }
	            for(int i=0;i<arr.length;i++)
	            {
	            System.out.print(arr[i]+" ");
	        } 
	            System.out.println();
	        }
	       }
   }

