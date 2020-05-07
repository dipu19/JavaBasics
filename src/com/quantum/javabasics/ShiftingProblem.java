package com.quantum.javabasics;

public class ShiftingProblem {
 
	public void shift(int[] arr)
	{
		/*
		 * for(int i=1;i<arr.length;i++) { for(int j=i-1;j>=0;j--) { if(arr[i]<arr[j]) {
		 * int num = arr[j]; arr[j]= arr[i]; arr[i] = num; } } }
		 */
		
		
		for(int i=0;i<arr.length;i++)
			 
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args)
	{
		ShiftingProblem object = new ShiftingProblem ();
		int[] arr = {4,3,2};
		object.shift(arr);
	}
}
