package com.quantum.javabasics;


import java.util.Arrays;

public class MissingNumberFromHackerrank {
  public void missingNumber(int[] brr,int[]arr)
  {

	  Arrays.sort(brr);
	  Arrays.sort(arr);
	 int length = arr.length;
	 for(int i=0;i<brr.length;i++)
	 {int count = 0;
		 for(int j=0;j<length;j++)
		 {
			 if(brr[i] == arr[j])
			 {
				 count++;
				 
				 for(int k=j;k<length-(j+1);k++)
				 {
					 arr[k] = arr[k+1];
				 }
				 length--;
			 }
		 }
		 if(count == 0)
		 {
			 
			 
			 System.out.print(brr[i]+" ");
			 
		 }
	 }
  }
  public static void main(String[] args)
  {
	  MissingNumberFromHackerrank object = new MissingNumberFromHackerrank();
	  int [] brr = {11 ,4 ,11 ,7 ,3 ,7 ,10 ,13 ,4 ,8, 12 ,11, 10 ,14 ,12};
	  int [] arr = {11 ,4 ,11 ,7 ,13 ,4 ,12 ,11 ,10 ,14};
	  object.missingNumber(brr, arr);
  }
}
