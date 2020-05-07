package com.quantum.javabasics;



public class MissingNumber {
	public void missing(int[] A,int[] B)
	{ 
		int[] result = new int[201];
	    int pivot = A[0];
	
	for(int i = 0; i < A.length; i++) {
		int distance = A[i] - pivot;
		result[100 + distance]--;
	}
	
	for(int i = 0; i < B.length; i++) {
		int distance = B[i] - pivot;
		result[100 + distance]++;
	}
	
	for(int i = 0; i < result.length; i++) {
		for(int j = 0; j < result[i]; j++) {
			int value = i - 100 + pivot;
			System.out.print(value + " ");
		}
	}
		}
	
	public static void main(String[] args)
	{
		MissingNumber obj = new MissingNumber();
		int[] brr= {1,2,4,1,4,1};
		int[] arr= {1,2,4};
		obj.missing(arr, brr);
	}
}
