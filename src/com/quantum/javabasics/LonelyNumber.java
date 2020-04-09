package com.quantum.javabasics;

import java.util.Arrays;

public class LonelyNumber {

	public int lonelyinteger(int[] a) {
	        Arrays.sort(a);
	        int result =0;
	       for(int i=0;i<a.length;i++)
	       {
	           int count=0;
	           for(int j=0;j<a.length;j++)
	           {
	              if(a[i] == a[j])
	              {
	                  count++;
	              }
	           }
	           if(count==1)
	           {
	              result = a[i];
	           }
	       }
	       return result;

	    }
	public static void main (String[] args)
	{
		int[] arr= { 34 ,95 ,34 ,64 ,45 ,95 ,16 ,80 ,80 ,75 ,3 ,25 ,75 ,25 ,31 ,3 ,64 ,16 ,31};
		LonelyNumber number = new LonelyNumber();
		System.out.println(number.lonelyinteger(arr));
	}
}
